package com.example.demo.entite;

import com.example.demo.entite.enums.Status;
import com.example.demo.entite.enums.Status_Analyse;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name="analyses")
public class Analyse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Echantillon echantillon;

    @ManyToOne
    private Type_Analyse typeAnalyse ;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date_debut;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date_fin;

    @Enumerated(EnumType.STRING)
    private Status_Analyse statusAnalyse;

    @ManyToOne
    private Responsable responsable;

    @Enumerated(EnumType.STRING)
    private Status status ;


}
