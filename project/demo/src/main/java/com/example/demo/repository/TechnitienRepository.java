package com.example.demo.repository;

import com.example.demo.entite.Technitien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnitienRepository extends JpaRepository<Technitien, Long> {
}
