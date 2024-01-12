package com.example.demo.service;


import com.example.demo.entite.Type_Analyse;
import com.example.demo.repository.TypeAnalyseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TypeAnalyseService {
    @Autowired
    private TypeAnalyseRepository typeAnalyseRepository;



    public List<Type_Analyse> getAllttypeAnalyse() {
        return typeAnalyseRepository.findAll();
    }

    public Optional<Type_Analyse> gettypeAnalyseById(long id) {
        return typeAnalyseRepository.findById(id);
    }

    public Type_Analyse addtypeAnalyse(Type_Analyse typeAnalyse) {
        return typeAnalyseRepository.save(typeAnalyse);
    }

    public Type_Analyse updatetypeAnalyse(Type_Analyse typeAnalyse) {
        return typeAnalyseRepository.save(typeAnalyse);
    }

    public void deletetypeAnalyse(long id) {
        typeAnalyseRepository.deleteById(id);
    }
}
