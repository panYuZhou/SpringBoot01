package com.example.demo.bean;


import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 *
 */

@Component
@ConfigurationProperties(prefix = "user")
@Slf4j
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    private int userId;
    private String userName;
    private double money;
    private Pet pet;

    private Integer age;
    private Date birth;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    public User(String userName, int userId) {
        this.userId = userId;
        this.userName = userName;
    }

}
