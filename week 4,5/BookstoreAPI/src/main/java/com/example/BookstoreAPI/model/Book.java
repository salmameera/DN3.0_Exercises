// Book.java
package com.example.BookstoreAPI.model;

import lombok.Data;
import lombok.Setter;
import jakarta.persistence.*;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    private Long isbn;
}
