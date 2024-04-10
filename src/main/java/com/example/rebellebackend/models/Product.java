package com.example.rebellebackend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    //в названии будет указана категория и name
    @ElementCollection
    private List<String> photos;

    private int volume;

    private String flavor;

    @ElementCollection
    private List<String> composition;

    @ElementCollection
    private List<String> bundling;

    private String manufacturerCountry;

    private boolean sold;

    @ManyToOne
    @JoinColumn(name = "oreder_id")
    private Order order;

}
