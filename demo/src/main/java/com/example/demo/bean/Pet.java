package com.example.demo.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 *
 */
@Data
@Component
@ToString
@NoArgsConstructor
public class Pet {
    public Pet(String name) {
        this.name = name;
    }

    private String name;

    private Double weight;

    private Integer age;
}
