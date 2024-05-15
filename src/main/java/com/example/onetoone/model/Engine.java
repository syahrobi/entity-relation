package com.example.onetoone.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
@Table(name = "engine")
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "engine_type")
    private String engineType;

    @Column(name = "capacity")
    private String capacity;

    @Column(name = "max_torque")
    private String maxTorque;

}
