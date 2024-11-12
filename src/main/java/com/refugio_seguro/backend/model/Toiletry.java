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
@Table(name = DatabaseConstants.TOILETRY_TABLE_NAME)
public class Toiletry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DatabaseConstants.TOILETRY_COLUMN_ID_NAME, nullable = false)
    private Long id;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_WCPAPER_NAME)
    private Integer wcPaper;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_TISSUES_NAME)
    private Integer tissues;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_PADS_NAME)
    private Integer pads;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_TAMPONS_NAME)
    private Integer tampons;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_SHOWERGEL_NAME)
    private Integer showerGel;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_HANDSOAP_NAME)
    private Integer handSoap;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_SHAMPOO_NAME)
    private Integer shampoo;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_SHAVINGSOAP_NAME)
    private Integer shavingSoap;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_RAZORS_NAME)
    private Integer razors;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_BABYDIAPERS_NAME)
    private Integer babyDiapers;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_ADULTDIAPERS_NAME)
    private Integer adultDiapers;

    @Size(max = 4000)
    @Column(name = DatabaseConstants.TOILETRY_COLUMN_OTHER_NAME, length = 4000)
    private String other;

}