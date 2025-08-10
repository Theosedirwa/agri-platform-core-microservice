package com.agriplatform.fieldmap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agriplatform.fieldmap.entities.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}