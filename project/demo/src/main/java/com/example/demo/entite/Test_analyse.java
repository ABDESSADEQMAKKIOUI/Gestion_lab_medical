package com.example.demo.entite;

import com.example.demo.entite.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Test_analyse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Type_Analyse typeAnalyse;

    private String name ;
    @OneToOne(mappedBy = "nom_testAnalyse" , cascade = CascadeType.ALL)
    @JoinColumn(name = "name", referencedColumnName = "name")
    private Enorm enorm;

    @ManyToOne
    private Technitien technitien;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date_debut;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date_fin;

    private float resultat;
    private String commentaire;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private Reactif reactif;


}

