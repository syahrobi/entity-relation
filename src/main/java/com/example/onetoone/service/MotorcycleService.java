package com.example.onetoone.service;

import com.example.onetoone.model.Motorcycle;

import java.util.Optional;

public interface MotorcycleService {
    Optional<Motorcycle> findById(Long id);
    Motorcycle save(Motorcycle motorcycle);


}
