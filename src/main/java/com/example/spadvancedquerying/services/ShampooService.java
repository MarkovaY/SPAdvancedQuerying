package com.example.spadvancedquerying.services;


import com.example.spadvancedquerying.entities.Shampoo;
import com.example.spadvancedquerying.entities.Size;

import java.util.List;

public interface ShampooService {

    List<Shampoo> findByBrand(String brand);

    List<Shampoo> findByBrandAndSize(String brand, Size size);
}
