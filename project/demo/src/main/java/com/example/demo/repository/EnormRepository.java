package com.example.demo.repository;

import com.example.demo.entite.Enorm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnormRepository extends JpaRepository<Enorm, Long> {
}
