package com.example.spadvancedquerying.services;


import com.example.spadvancedquerying.entities.Shampoo;
import com.example.spadvancedquerying.entities.Size;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;

public interface ShampooService {

    List<Shampoo> findBySize(Size size);

    List<Shampoo> findBySizeOrLabelId(Size size, long labelId);

    List<Shampoo> findByPriceGreaterThan(BigDecimal price);

    int countShampooByPriceLessThan(BigDecimal price);

    List<Shampoo> findAllShampoosWithIngredientsIn(List<String> ingredients);

}
