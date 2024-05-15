package com.example.onetoone.service.impl;

import com.example.onetoone.model.Motorcycle;
import com.example.onetoone.repository.MotorcycleRepository;
import com.example.onetoone.service.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MotorcycleServiceImpl implements MotorcycleService {

    @Autowired
    private MotorcycleRepository motorcycleRepository;

    @Override
    public Optional<Motorcycle> findById(Long id) {
        return motorcycleRepository.findById(id);
    }

    @Override
    public Motorcycle save(Motorcycle motorcycle) {
        return motorcycleRepository.save(motorcycle);
    }
}
