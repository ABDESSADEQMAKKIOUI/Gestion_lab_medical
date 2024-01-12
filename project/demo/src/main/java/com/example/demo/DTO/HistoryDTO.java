package com.example.demo.DTO;

import lombok.Data;

@Data
public class HistoryDTO {

    private long id;
    private PatientDTO patient;
    private TestDTO test;
    private int nombre;
}

