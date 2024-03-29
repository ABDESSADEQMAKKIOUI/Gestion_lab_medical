package com.example.demo.service;

import com.example.demo.entite.Responsable;
import com.example.demo.repository.ResponsbleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ResponsableService {
    @Autowired
    private ResponsbleRepository responsbleRepository;



    public List<Responsable> getAllresponsable() {
        return responsbleRepository.findAll();
    }

    public Optional<Responsable> getResponsableById(long id) {
        return responsbleRepository.findById(id);
    }

    public Responsable addResponsable(Responsable responsable) {
        return responsbleRepository.save(responsable);
    }

    public Responsable updateResponsable(Responsable responsable) {
        return responsbleRepository.save(responsable);
    }

    public void deleteResponsable(long id) {
        responsbleRepository.deleteById(id);
    }
}
