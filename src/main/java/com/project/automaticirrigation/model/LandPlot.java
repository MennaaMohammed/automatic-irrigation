package com.project.automaticirrigation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "landPlot")
public class LandPlot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "plot_id")
    String id;
    @Column(name = "plot_name")
    String name;
    @Column(name = "last_irrigation_date")
    LocalDateTime lastIrrigationDate;
    @Column(name = "irrigation_interval")
    LocalTime irrigationInterval;
    @Column(name = "irrigation_status")
    String irrigationStatus;
    //don't think it's really needed
    @Column(name = "amount_of_water")
    String amountOfWater;
}
