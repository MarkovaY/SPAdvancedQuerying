package com.example.spadvancedquerying;

import com.example.spadvancedquerying.entities.Shampoo;
import com.example.spadvancedquerying.entities.Size;
import com.example.spadvancedquerying.services.ShampooService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    private ShampooService shampooService;

    public CommandLineRunnerImpl(ShampooService shampooService) {
        this.shampooService = shampooService;
    }

    @Override
    public void run(String... args) throws Exception {

//       List<Shampoo> shampooByBrand = shampooService.findByBrand("Swiss Green Apple & Nettle");
//       shampooByBrand.forEach(System.out::println);

//        List<Shampoo> shampooByBrandAndSize = shampooService.findByBrandAndSize("Swiss Green Apple & Nettle", Size.SMALL);
//        shampooByBrandAndSize.forEach(System.out::println);

//        Create a method that selects all shampoos with a given size, ordered by shampoo id.


    }
}
