package com.example.elie.demo.repository;
import com.example.elie.demo.model.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, Long> {
}
