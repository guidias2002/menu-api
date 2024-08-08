package com.example.cardapio.food;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public void createFood(CreateFoodDto data){
        Food newFood = new Food(data);

        this.foodRepository.save(newFood);
    }

    public List<ResponseFoodDto> listFoods(){
        List<ResponseFoodDto> foods = this.foodRepository.findAll()
                .stream().map((food) -> new ResponseFoodDto(food.getId(), food.getTitle(), food.getImage(), food.getPrice()))
                .toList();

        return foods;
    }
}
