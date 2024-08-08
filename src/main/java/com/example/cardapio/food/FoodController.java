package com.example.cardapio.food;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @PostMapping
    public ResponseEntity createFood(@RequestBody @Valid CreateFoodDto data){
        this.foodService.createFood(data);

        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public ResponseEntity<List<ResponseFoodDto>> listFoods(){
        List<ResponseFoodDto> foods = this.foodService.listFoods();

        return ResponseEntity.ok(foods);
    }
}
