package com.example.demo.entite;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
public class Technitien extends Personne{
    @OneToMany(mappedBy = "technitien", cascade = CascadeType.ALL)
    private List<Test_analyse> testAnalyses ;
    @OneToOne()
    private Compte compte ;

}
