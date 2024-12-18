package com.refugio_seguro.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = DatabaseConstants.LOCATION_TABLE_NAME)
public class Location {
    @Id
    @Column(name = DatabaseConstants.LOCATION_COLUMN_ID_NAME, nullable = false)
    private java.lang.Long id;

    @NotNull
    @Column(name = DatabaseConstants.LOCATION_COLUMN_LATITUD_NAME, nullable = false, precision = 8, scale = 6)
    private java.math.BigDecimal latitud;

    @NotNull
    @Column(name = DatabaseConstants.LOCATION_COLUMN_LONGITUD_NAME, nullable = false, precision = 9, scale = 6)
    private java.math.BigDecimal longitud;

    @Size(max = 45)
    @NotNull
    @Column(name = DatabaseConstants.LOCATION_COLUMN_POSTALCODE_NAME, nullable = false, length = 45)
    private java.lang.String postalCode;

    @Size(max = 255)
    @NotNull
    @Column(name = DatabaseConstants.LOCATION_COLUMN_CITY_NAME, nullable = false)
    private java.lang.String city;

    @Size(max = 255)
    @NotNull
    @Column(name = DatabaseConstants.LOCATION_COLUMN_STREETNAME_NAME, nullable = false)
    private java.lang.String streetName;

    @Column(name = DatabaseConstants.LOCATION_COLUMN_FLAT_NAME)
    private java.lang.Integer flat;

    @Size(max = 45)
    @Column(name = DatabaseConstants.LOCATION_COLUMN_DOOR_NAME, length = 45)
    private java.lang.String door;

    @Size(max = 3000)
    @Column(name = DatabaseConstants.LOCATION_COLUMN_OTHER_NAME, length = 3000)
    private java.lang.String other;

}