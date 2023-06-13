package com.example.openHostal.Repository;

import com.example.openHostal.Entity.Hostal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HostalRepo extends JpaRepository<Hostal, Long> {

    Optional<Hostal> findHostalByName(String name);
}
