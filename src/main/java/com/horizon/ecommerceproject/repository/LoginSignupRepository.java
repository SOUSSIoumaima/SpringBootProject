package com.horizon.ecommerceproject.repository;

import com.horizon.ecommerceproject.entity.LoginSignup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginSignupRepository extends JpaRepository<LoginSignup,Long> {
}
