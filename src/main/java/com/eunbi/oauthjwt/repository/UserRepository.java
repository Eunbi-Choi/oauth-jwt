package com.eunbi.oauthjwt.repository;

import com.eunbi.oauthjwt.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

    UserEntity findByUsername(String username);

}
