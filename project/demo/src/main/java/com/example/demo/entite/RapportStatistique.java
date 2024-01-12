package com.example.demo.entite;

import com.example.demo.entite.enums.Periode_Rapport;
import com.example.demo.entite.enums.Type_Rapport;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class RapportStatistique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private Type_Rapport typeRapport;

    @Enumerated(EnumType.STRING)
    private Periode_Rapport periodeRapport;
    private String description ;

}
