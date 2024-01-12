package com.example.demo.entite;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
public class Responsable extends Personne{
    @OneToMany(mappedBy = "responsable", cascade = CascadeType.ALL)
    private List<Analyse> analyses ;
    @OneToOne
    private Compte compte ;
}
