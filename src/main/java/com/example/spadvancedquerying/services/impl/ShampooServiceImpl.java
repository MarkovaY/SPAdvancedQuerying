package com.example.spadvancedquerying.services.impl;


import com.example.spadvancedquerying.entities.Shampoo;
import com.example.spadvancedquerying.entities.Size;
import com.example.spadvancedquerying.repositories.ShampooRepository;
import com.example.spadvancedquerying.services.ShampooService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;


@Service
public class ShampooServiceImpl implements ShampooService {

    private ShampooRepository shampooRepository;

    public ShampooServiceImpl(ShampooRepository shampooRepository) {
        this.shampooRepository = shampooRepository;
    }

    @Override
    public List<Shampoo> findBySize(Size size) {
        return shampooRepository.findBySizeOrderById(size);
    }

    @Override
    public List<Shampoo> findBySizeOrLabelId(Size size, long labelId) {
        return shampooRepository.findBySizeOrLabelIdOrderByPrice(size, labelId);
    }

    @Override
    public List<Shampoo> findByPriceGreaterThan(BigDecimal price) {
        return shampooRepository.findByPriceGreaterThanOrderByPriceDesc(price);
    }

    @Override
    public int countShampooByPriceLessThan(BigDecimal price) {
        return shampooRepository.countShampooByPriceLessThan(price);
    }

    @Override
    public List<Shampoo> findAllShampoosWithIngredientsIn(List<String> ingredients) {
        return shampooRepository.findByIngredientsNameIn(ingredients);
    }

}
