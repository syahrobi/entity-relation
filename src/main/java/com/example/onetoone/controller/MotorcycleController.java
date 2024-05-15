package com.example.onetoone.controller;

import com.example.onetoone.model.Motorcycle;
import com.example.onetoone.service.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/motorcycle")
public class MotorcycleController {

    @Autowired
    private MotorcycleService motorcycleService;

    @PostMapping("/saveMotorcycle")
    public Motorcycle getMotorcycle(@RequestBody Motorcycle motorcycle) {
        return motorcycleService.save(motorcycle);
    }

    @GetMapping("/getMotorcycle/{id}")
    public Optional<Motorcycle> getMotorcycle(@PathVariable String id) {
        return motorcycleService.findById(Long.valueOf(id));
    }
}
