package com.example.demo.entite;

import com.example.demo.entite.enums.Materiel_type;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Materiel {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String nom ;
    @ManyToOne
    private Type_Analyse typeAnalyse ;
    @Enumerated(EnumType.STRING)
    private Materiel_type materielType ;
}
