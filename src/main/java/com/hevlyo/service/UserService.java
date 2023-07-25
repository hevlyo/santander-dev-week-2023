package com.hevlyo.service;

import com.hevlyo.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
