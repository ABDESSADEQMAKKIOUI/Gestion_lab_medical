package com.example.demo.DTO;

import com.example.demo.DTO.enums.Type_RapportDTO;
import lombok.Data;
import com.example.demo.DTO.enums.Periode_RapportDTO ;


@Data
public class RapportStatistiqueDTO {

    private long id;
    private Type_RapportDTO typeRapport;
    private Periode_RapportDTO periodeRapport;
}

