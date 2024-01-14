package com.projectapia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectapia.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long>{

}
