package com.testtaskdataox.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "jobs")
@Data
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "job_url")
    private String jobUrl;
    @Column(name = "position_name")
    private String positionName;
    @Column(name = "organization_url")
    private String organizationUrl;
    @Column(name = "logo_url")
    private String logoUrl;
    @Column(name = "organization_title")
    private String organizationTitle;
    @Column(name = "labor_function")
    private String laborFunction;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "job")
    private List<JobLocation> locations;
    @Column(name = "post_date")
    private LocalDateTime postDate;
    @Column(name = "description")
    private String description;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "job")
    private List<JobTag> tagsNames;
}
