package com.example.tacolearning;

import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Date;
import java.util.List;

@Data
public class Taco {

    private Long id;

    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    // tag::allButValidation[]
    private String name;
    // end::allButValidation[]
    @Size(min=1, message="You must choose at least 1 ingredient")
    // tag::allButValidation[]
    private List<Ingredient> ingredients;
    private Date createdAt;

}
