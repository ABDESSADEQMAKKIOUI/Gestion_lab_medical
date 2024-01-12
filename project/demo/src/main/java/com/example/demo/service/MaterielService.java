package com.example.demo.service;

import com.example.demo.entite.Materiel;
import com.example.demo.repository.MaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MaterielService {
    @Autowired
    private MaterielRepository materielRepository;


    public List<Materiel> getAllMateriel() {
        return materielRepository.findAll();
    }

    public Optional<Materiel> getMaterielById(long id) {
        return materielRepository.findById(id);
    }

    public Materiel addMateriel(Materiel materiel) {
        return materielRepository.save(materiel);
    }

    public Materiel updateMateriel(Materiel materiel) {
        return materielRepository.save(materiel);
    }

    public void deleteMateriel(long id) {
        materielRepository.deleteById(id);
    }
}
