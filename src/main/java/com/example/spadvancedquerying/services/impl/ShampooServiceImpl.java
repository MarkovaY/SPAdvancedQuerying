package com.example.spadvancedquerying.services.impl;

import com.example.spadvancedquerying.entities.Shampoo;
import com.example.spadvancedquerying.entities.Size;
import com.example.spadvancedquerying.repositories.ShampooRepository;
import com.example.spadvancedquerying.services.ShampooService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShampooServiceImpl implements ShampooService {

    private ShampooRepository shampooRepository;

    public ShampooServiceImpl(ShampooRepository shampooRepository) {
        this.shampooRepository = shampooRepository;
    }

    @Override
    public List<Shampoo> findByBrand(String brand) {

        return shampooRepository.findByBrand(brand);
    }

    @Override
    public List<Shampoo> findByBrandAndSize(String brand, Size size) {
        return shampooRepository.findByBrandAndSize(brand, size);
    }
}
