package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "foods")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String title;
    private String image;
    private Integer price;


    public Food(CreateFoodDto data) {
        this.id = data.id();
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }
}
