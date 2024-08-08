package com.example.cardapio.food;

import java.util.UUID;

public record CreateFoodDto(UUID id, String title, String image, Integer price) {
}
