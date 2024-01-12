package com.example.demo.entite;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Patient extends Personne {
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Echantillon> echantillons ;
}

