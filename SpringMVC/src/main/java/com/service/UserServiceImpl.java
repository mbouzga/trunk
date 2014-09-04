/*
 * TODO Short description of the file
 * 
 * @Copyright
 */
package com.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Override
    public void addUser() {
        System.out.println("******************** Appel du service addUser() *******************");
    }

}
