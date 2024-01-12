package com.example.demo.service;

import com.example.demo.entite.Reactif;
import com.example.demo.repository.ReactifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ReactifService {

    @Autowired
    private ReactifRepository reactifRepository;

    // Méthodes de service pour la logique métier liée à Reactif

    public List<Reactif> getAllReactifs() {
        return reactifRepository.findAll();
    }

    public Optional<Reactif> getReactifById(long id) {
        return reactifRepository.findById(id);
    }

    public Reactif addReactif(Reactif reactif) {
        return reactifRepository.save(reactif);
    }

    public Reactif updateReactif(Reactif reactif) {
        return reactifRepository.save(reactif);
    }

    public void deleteReactif(long id) {
        reactifRepository.deleteById(id);
    }
}

