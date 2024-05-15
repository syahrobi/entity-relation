package com.example.onetoone.service;

import com.example.onetoone.model.Owner;

import java.util.Optional;

public interface OwnerService {

    void save(Owner owner);

    void getById(int id);
}
