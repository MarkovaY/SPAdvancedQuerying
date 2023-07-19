package com.example.spadvancedquerying;

import com.example.spadvancedquerying.entities.Ingredient;
import com.example.spadvancedquerying.entities.Shampoo;
import com.example.spadvancedquerying.services.IngredientService;
import com.example.spadvancedquerying.services.ShampooService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.*;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    private ShampooService shampooService;
    private IngredientService ingredientService;

    public CommandLineRunnerImpl(ShampooService shampooService, IngredientService ingredientService) {
        this.shampooService = shampooService;
        this.ingredientService = ingredientService;
    }

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);

//        String input = scanner.nextLine();

//      1. Create a method that selects all shampoos with a given size, ordered by shampoo id.

//        Size size = Size.valueOf(input);
//        List<Shampoo> shampoosBySizeAndID = shampooService.findBySize(size);
//        shampoosBySizeAndID.forEach(shampoo -> System.out.printf("%s %s %.2flv.%n", shampoo.getBrand(), shampoo.getSize(), shampoo.getPrice()));

//      2. Create a method that selects all shampoos with a given size or label id. Sort the result ascending by price.

//        Size size = Size.valueOf(input);
//        long labelId = Long.parseLong(scanner.nextLine());
//        List<Shampoo> shampooByBrandOrLabel = shampooService.findBySizeOrLabelId(size, labelId);
//        shampooByBrandOrLabel.forEach(shampoo -> System.out.printf("%s %s %.2flv.%n", shampoo.getBrand(), shampoo.getSize(), shampoo.getPrice()));

//      3. Create a method that selects all shampoos, which price is higher than a given price. Sort the result descending by price.

//        BigDecimal price = BigDecimal.valueOf(Double.parseDouble(input));
//        List<Shampoo> shampooByPriceGreaterThan = shampooService.findByPriceGreaterThan(price);
//        shampooByPriceGreaterThan.forEach(shampoo -> System.out.printf("%s %s %.2flv.%n", shampoo.getBrand(), shampoo.getSize(), shampoo.getPrice()));

//      4. Create a method that selects all ingredients, which name starts with given letters.

//        List<Ingredient> ingredientsStartingWithLetter = ingredientService.findByNameStartingWith(input);
//        ingredientsStartingWithLetter.forEach(ingredient -> System.out.printf("%s%n", ingredient.getName()));

//      5. Create a method that selects all ingredients, which are contained in a given list. Sort the result ascending by price.

//        List<Ingredient> ingredientsByNameGiven = ingredientService.findByNameWithin(List.of("Lavender", "Herbs", "Apple"));
//        ingredientsByNameGiven.forEach(ingredient -> System.out.printf("%s%n", ingredient.getName()));

//      6. Create a method that counts all shampoos with price lower than a given price.

//        double price = Double.parseDouble(input);
//        int countShampoosCheaperThan = shampooService.countShampooByPriceLessThan(BigDecimal.valueOf(price));
//        System.out.println(countShampoosCheaperThan);

//      7. Create a method that selects all shampoos with ingredients included in a given list.

        List<Shampoo> shampoosWithGivenIngredients  = shampooService.findAllShampoosWithIngredientsIn(List.of("Berry", "Mineral-Collagen"));
        shampoosWithGivenIngredients.forEach(shampoo -> System.out.printf("%s%n", shampoo.getBrand()));
    }
}