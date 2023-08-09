package com.project.automaticirrigation.model;

import jakarta.persistence.*;

@Entity
@Table(name="sensor_device")
public class SensorDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sensor_id")
    String id;
    @Column(name = "sensor_name")
    String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "plot_id", referencedColumnName = "plot_id")
    LandPlot plotId;
    @Column(name = "retry_limit")
    long retryLimit;
    @Column(name = "retry_counter")
    long retryCounter;
}
