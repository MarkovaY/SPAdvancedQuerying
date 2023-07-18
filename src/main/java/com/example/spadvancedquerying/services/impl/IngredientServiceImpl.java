package com.example.spadvancedquerying.services.impl;

import com.example.spadvancedquerying.entities.Ingredient;
import com.example.spadvancedquerying.repositories.IngredientRepository;
import com.example.spadvancedquerying.services.IngredientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    private IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }


    @Override
    public List<Ingredient> findByNameStartingWith(String letter) {
        return ingredientRepository.findByNameStartingWith(letter);
    }

    @Override
    public List<Ingredient> findByNameWithin(List<String> ingredients) {
        return ingredientRepository.findByNameInOrderByPrice(ingredients);
    }
}
