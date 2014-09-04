package com.service;

import org.springframework.security.access.prepost.PreAuthorize;

public interface IUserService {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void addUser();
}
