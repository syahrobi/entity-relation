package com.example.onetoone.repository;

import com.example.onetoone.model.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MotorcycleRepository extends JpaRepository<Motorcycle, Integer> {
    Optional<Motorcycle> findById(Long aLong);
}