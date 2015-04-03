package com.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.persistence.entity.UserEntity;

@WebService(name="IUserService", serviceName="users")
public interface IUserService {
	
	List<UserEntity> getAllUsers();
	
	UserEntity findUserByLogin(@WebParam(name="login")String login);
}
