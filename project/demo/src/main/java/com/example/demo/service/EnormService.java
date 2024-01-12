package com.example.demo.service;


import com.example.demo.entite.Enorm;
import com.example.demo.repository.EnormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EnormService {
    @Autowired
    private EnormRepository enormRepository;


    public List<Enorm> getAllEnorms() {
        return enormRepository.findAll();
    }

    public Optional<Enorm> getEnormsById(long id) {
        return enormRepository.findById(id);
    }

    public Enorm addEnorms(Enorm enorm) {return enormRepository.save(enorm); }

    public Enorm updateEnorms(Enorm enorm) {
        return enormRepository.save(enorm);
    }

    public void deleteEnorms(long id) {
        enormRepository.deleteById(id);
    }
}
