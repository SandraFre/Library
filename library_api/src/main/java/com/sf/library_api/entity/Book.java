package com.sf.library_api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.Year;

@Setter
@Getter
@Entity
@Table(name = "Books")
public class Book {
    @Id
    @Column(columnDefinition = "VARCHAR(10)", updatable = false)
    @Positive
    @Digits(integer = 10, fraction = 0)
    private Long barcode;
    @NotBlank
    private String title;
    @NotBlank
    private String author;
    @NotBlank
    @PastOrPresent
    private Year year;
    @PositiveOrZero
    private int quantity;
    @Positive
    @NotNull
    private BigDecimal price;
}
