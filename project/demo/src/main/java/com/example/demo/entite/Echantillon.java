package com.example.demo.entite;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Echantillon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Patient patient;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date_prend;
    @OneToMany(mappedBy = "echantillon", cascade = CascadeType.ALL)
   private List<Analyse> analyses ;

}

