package com.smartbazaar.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartbazaar.entity.User;
import com.smartbazaar.repository.UserRepository;
import com.smartbazaar.service.UserService;
import com.smartbazaar.exception.ResourceNotFoundException;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo) { this.repo = repo; }

    @Override
    public User create(User u) {
        if (u.getWallet() != null) u.getWallet().setUser(u);
        return repo.save(u);
    }

    @Override
    public User getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found: " + id));
    }

    @Override
    public List<User> listAll() { return repo.findAll(); }
}
