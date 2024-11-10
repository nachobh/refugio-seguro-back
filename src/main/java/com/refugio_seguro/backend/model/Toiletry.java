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
    private java.lang.Long id;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_WCPAPER_NAME)
    private java.lang.Integer wcPaper;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_TISSUES_NAME)
    private java.lang.Integer tissues;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_PADS_NAME)
    private java.lang.Integer pads;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_TAMPONS_NAME)
    private java.lang.Integer tampons;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_SHOWERGEL_NAME)
    private java.lang.Integer showerGel;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_HANDSOAP_NAME)
    private java.lang.Integer handSoap;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_SHAMPOO_NAME)
    private java.lang.Integer shampoo;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_SHAVINGSOAP_NAME)
    private java.lang.Integer shavingSoap;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_RAZORS_NAME)
    private java.lang.Integer razors;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_BABYDIAPERS_NAME)
    private java.lang.Integer babyDiapers;

    @Column(name = DatabaseConstants.TOILETRY_COLUMN_ADULTDIAPERS_NAME)
    private java.lang.Integer adultDiapers;

    @Size(max = 4000)
    @Column(name = DatabaseConstants.TOILETRY_COLUMN_OTHER_NAME, length = 4000)
    private java.lang.String other;

}