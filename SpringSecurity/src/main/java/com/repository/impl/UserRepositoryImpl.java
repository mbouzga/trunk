package com.repository.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.entity.UserEntity;
import com.repository.IUserRepository;
import com.repository.config.AbstractJPACustomRepository;

@Repository("userRepository")
public class UserRepositoryImpl extends AbstractJPACustomRepository implements IUserRepository{

	@SuppressWarnings("unchecked")
	@Override
	public List<UserEntity> getAllUsers() {
		String query = "FROM UserEntity";
		Query querySql = entityManager.createQuery(query);
		return (List<UserEntity>)querySql.getResultList();
	}

	@Override
	public UserEntity findUserByLogin(String login) {
		String query = "FROM UserEntity user WHERE user.login = :login";
		Query querySql = entityManager.createQuery(query);
		querySql.setParameter("login", login);
		return (UserEntity) querySql.getSingleResult();
	}

}
