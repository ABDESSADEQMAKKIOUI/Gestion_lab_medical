package com.example.demo.DTO;

import lombok.Data;

import java.util.List;

@Data
public class PatientDTO extends Personne {

    private long id;
    private List<HistoryDTO> histories;
}
