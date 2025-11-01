package com.smartbazaar.service;

import com.smartbazaar.entity.User;

import java.util.List;

public interface UserService {
    User create(User u);
    User getById(Long id);
    List<User> listAll();
}
