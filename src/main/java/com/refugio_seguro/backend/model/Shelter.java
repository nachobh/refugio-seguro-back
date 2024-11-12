package com.refugio_seguro.backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = DatabaseConstants.SHELTER_TABLE_NAME)
public class Shelter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DatabaseConstants.SHELTER_COLUMN_ID_NAME, nullable = false)
    private Long id;

    @Size(max = 255)
    @NotNull
    @Column(name = DatabaseConstants.SHELTER_COLUMN_NAME_NAME, nullable = false)
    private String name;

    @Size(max = 255)
    @NotNull
    @Column(name = DatabaseConstants.SHELTER_COLUMN_PHONE_NUMBER_NAME, nullable = false)
    private String phoneNumber;

    @NotNull
    @Column(name = DatabaseConstants.SHELTER_COLUMN_MAXCAPACITY_NAME, nullable = false)
    private Integer maxCapacity;

    @NotNull
    @Column(name = DatabaseConstants.SHELTER_COLUMN_CURRENTAVAILABILITY_NAME, nullable = false)
    private Integer currentAvailability;

    @NotNull
    @Column(name = DatabaseConstants.SHELTER_COLUMN_ROOMSQTY_NAME, nullable = false)
    private Integer roomsQty;

    @NotNull
    @Column(name = DatabaseConstants.SHELTER_COLUMN_BATHSQTY_NAME, nullable = false)
    private Integer bathsQty;

    @NotNull
    @Column(name = DatabaseConstants.SHELTER_COLUMN_WASHINGMACHINESQTY_NAME, nullable = false)
    private Integer washingMachinesQty;

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

    @OneToMany(mappedBy = "shelter")
    private Set<ShelterUpdate> shelterUpdates = new LinkedHashSet<>();

}