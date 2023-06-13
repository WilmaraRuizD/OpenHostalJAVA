package com.example.openHostal.Repository;


import com.example.openHostal.Entity.Hostal;
import com.example.openHostal.Entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepo extends JpaRepository<Rol, Long> {
    Optional<Rol> findRolByNameRol(String  nameRol);
}
