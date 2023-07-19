package com.example.spadvancedquerying.repositories;

import com.example.spadvancedquerying.entities.Shampoo;

import com.example.spadvancedquerying.entities.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

import java.util.List;


@Repository
public interface ShampooRepository extends JpaRepository<Shampoo, Long> {


    List<Shampoo> findBySizeOrderById(Size size);

    List<Shampoo> findBySizeOrLabelIdOrderByPrice(Size size, Long labelId);

    List<Shampoo> findByPriceGreaterThanOrderByPriceDesc(BigDecimal price);

    int countShampooByPriceLessThan(BigDecimal price);

    @Query(value = "SELECT s FROM Shampoo AS s JOIN s.ingredients AS i WHERE i.name IN :ingredientNames")
    List<Shampoo> findByIngredientsNameIn(List<String> ingredientNames);
}
