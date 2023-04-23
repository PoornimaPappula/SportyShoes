package com.sportyshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoes.entity.CustomRole;
import com.sportyshoes.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByName(CustomRole role);
}
