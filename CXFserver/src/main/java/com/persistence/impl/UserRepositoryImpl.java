package com.persistence.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.persistence.IUserRepository;
import com.persistence.config.AbstractJPARepository;
import com.persistence.entity.UserEntity;

@Repository("userRepository")
@Transactional
public class UserRepositoryImpl extends AbstractJPARepository implements IUserRepository{

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
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
