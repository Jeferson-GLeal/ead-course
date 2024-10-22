package com.ead.ms_authuser.repositories;

import com.ead.ms_authuser.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {

}
