package com.example.spadvancedquerying.services.impl;

import com.example.spadvancedquerying.repositories.ShampooRepository;
import com.example.spadvancedquerying.services.ShampooService;
import org.springframework.stereotype.Service;

@Service
public class ShampooServiceImpl implements ShampooService {

    private ShampooRepository shampooRepository;

    public ShampooServiceImpl(ShampooRepository shampooRepository) {
        this.shampooRepository = shampooRepository;
    }
}
