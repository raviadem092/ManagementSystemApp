package com.ravi.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ravi.myApp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
