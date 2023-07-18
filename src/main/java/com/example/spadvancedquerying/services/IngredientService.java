package com.example.spadvancedquerying.services;

import com.example.spadvancedquerying.entities.Ingredient;

import java.util.List;

public interface IngredientService {
    List<Ingredient> findByNameStartingWith(String letter);
}
