package com.testtaskdataox.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "job_tags")
@Data
public class JobTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "tag_name")
    private String tagName;
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
}
