package com.example.onetoone.controller;

import com.example.onetoone.model.Motorcycle;
import com.example.onetoone.model.Owner;
import com.example.onetoone.service.MotorcycleService;
import com.example.onetoone.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @PostMapping("/saveOwner")
    public void getMotorcycle(@RequestBody Owner owner) {
        ownerService.save(owner);
    }

    @GetMapping("/getOwner/{id}")
    public void getOwner(@PathVariable(name = "id") int id) {
        ownerService.getById(id);
    }
}
