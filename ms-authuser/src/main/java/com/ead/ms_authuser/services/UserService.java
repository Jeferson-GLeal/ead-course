package com.ead.ms_authuser.services;

import com.ead.ms_authuser.models.UserModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    List<UserModel> findAll();

    Optional<UserModel> findById(UUID userId);

    void delete(UserModel userModel);

    void save(UserModel userModel);

    boolean existsByUserName(String username);

    boolean existsByEmail(String email);
}
