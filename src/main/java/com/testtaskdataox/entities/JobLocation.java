package com.testtaskdataox.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "job_locations")
@Data
public class JobLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "location")
    private String location;
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
}
