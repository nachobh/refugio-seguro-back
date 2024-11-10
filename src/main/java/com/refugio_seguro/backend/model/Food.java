package com.refugio_seguro.backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = DatabaseConstants.FOOD_TABLE_NAME)
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DatabaseConstants.FOOD_COLUMN_ID_NAME, nullable = false)
    private java.lang.Integer id;

    @Column(name = DatabaseConstants.FOOD_COLUMN_FRUITQTY_NAME)
    private java.lang.Integer fruitQty;

    @Size(max = 45)
    @Column(name = DatabaseConstants.FOOD_COLUMN_FRUIDUNIT_NAME, length = 45)
    private java.lang.String fruidUnit;

    @Column(name = DatabaseConstants.FOOD_COLUMN_MEATQTY_NAME)
    private java.lang.Integer meatQty;

    @Size(max = 45)
    @Column(name = DatabaseConstants.FOOD_COLUMN_MEATUNIT_NAME, length = 45)
    private java.lang.String meatUnit;

    @Column(name = DatabaseConstants.FOOD_COLUMN_VEGETABLESQTY_NAME)
    private java.lang.Integer vegetablesQty;

    @Size(max = 45)
    @Column(name = DatabaseConstants.FOOD_COLUMN_VEGETABLESUNIT_NAME, length = 45)
    private java.lang.String vegetablesUnit;

    @Column(name = DatabaseConstants.FOOD_COLUMN_FISHQTY_NAME)
    private java.lang.Integer fishQty;

    @Size(max = 45)
    @Column(name = DatabaseConstants.FOOD_COLUMN_FISHUNIT_NAME, length = 45)
    private java.lang.String fishUnit;

    @Column(name = DatabaseConstants.FOOD_COLUMN_RICEQTY_NAME)
    private java.lang.Integer riceQty;

    @Size(max = 45)
    @Column(name = DatabaseConstants.FOOD_COLUMN_RICEUNIT_NAME, length = 45)
    private java.lang.String riceUnit;

    @Column(name = DatabaseConstants.FOOD_COLUMN_PASTAQTY_NAME)
    private java.lang.Integer pastaQty;

    @Size(max = 45)
    @Column(name = DatabaseConstants.FOOD_COLUMN_PASTAUNIT_NAME, length = 45)
    private java.lang.String pastaUnit;

}