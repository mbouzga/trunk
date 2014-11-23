package com.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.entity.RoleEntity;
import com.entity.UserEntity;
import com.service.IUserService;

@Service("users")
public class UserSecurity implements UserDetailsService {

	@Autowired
	private IUserService userService;

	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		UserEntity user = userService.findUserByLogin(userName);
		List<GrantedAuthority> authorities = buildUserAuthority(user.getRoles());

		return buildUserForAuthentication(user, authorities);
	}

	// Converts UserEntity user to
	// org.springframework.security.core.userdetails.User
	private User buildUserForAuthentication(UserEntity user,
			List<GrantedAuthority> authorities) {
		return new User(user.getLogin(), user.getPassword(), true, true, true,
				true, authorities);
	}

	private List<GrantedAuthority> buildUserAuthority(List<RoleEntity> userRoles) {

		List<GrantedAuthority> result = new ArrayList<GrantedAuthority>();

		// Build user's authorities
		for (RoleEntity userRole : userRoles) {
			result.add(new SimpleGrantedAuthority(userRole.getRoleName()));
		}

		return result;
	}
}
