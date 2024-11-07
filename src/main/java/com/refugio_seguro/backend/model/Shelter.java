package com.refugio_seguro.backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = DatabaseConstants.SHELTER_TABLE_NAME)
public class Shelter {
    @Id
    @Column(name = DatabaseConstants.SHELTER_COLUMN_ID_NAME, nullable = false)
    private java.lang.Long id;

    @Size(max = 255)
    @NotNull
    @Column(name = DatabaseConstants.SHELTER_COLUMN_NAME_NAME, nullable = false)
    private java.lang.String name;

    @NotNull
    @Column(name = DatabaseConstants.SHELTER_COLUMN_MAXCAPACITY_NAME, nullable = false)
    private java.lang.Integer maxCapacity;

    @NotNull
    @Column(name = DatabaseConstants.SHELTER_COLUMN_CURRENTAVAILABILITY_NAME, nullable = false)
    private java.lang.Integer currentAvailability;

    @NotNull
    @Column(name = DatabaseConstants.SHELTER_COLUMN_ROOMSQTY_NAME, nullable = false)
    private java.lang.Integer roomsQty;

    @NotNull
    @Column(name = DatabaseConstants.SHELTER_COLUMN_BATHSQTY_NAME, nullable = false)
    private java.lang.Integer bathsQty;

    @NotNull
    @Column(name = DatabaseConstants.SHELTER_COLUMN_WASHINGMACHINESQTY_NAME, nullable = false)
    private java.lang.Integer washingMachinesQty;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LOCATION_ID", nullable = false)
    private Location location;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FOOD_ID", nullable = false)
    private Food food;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLEANING_UTILITIES_ID", nullable = false)
    private CleaningUtility cleaningUtilities;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TOILETRIES_ID", nullable = false)
    private Toiletry toiletries;

}