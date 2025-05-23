package com.enset.maintenance_backend;

import com.enset.maintenance_backend.entities.Machine;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.enset.maintenance_backend.repositories.*;
import com.enset.maintenance_backend.entities.*;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
public class MaintenancePlatformBackendApplication  implements CommandLineRunner {

    @Autowired
    private MachineRepository machineRepo;
    @Autowired
    private SensorDataRepository sensorDataRepo;
    @Autowired
    private MaintenanceActionRepository maintenanceRepo;
    @Autowired
    private PredictionRepository predictionRepo;
    @Autowired
    private FailureRepository failureRepo;

    public static void main(String[] args) {
        SpringApplication.run(MaintenancePlatformBackendApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

    }
}

