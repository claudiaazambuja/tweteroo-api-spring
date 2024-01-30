package com.tweeteroo.api.repositories;

import com.tweeteroo.api.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    
}
