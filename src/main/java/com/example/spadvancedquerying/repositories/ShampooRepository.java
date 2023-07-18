package com.example.spadvancedquerying.repositories;

import com.example.spadvancedquerying.entities.Shampoo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShampooRepository extends JpaRepository<Shampoo, Long> {
}
