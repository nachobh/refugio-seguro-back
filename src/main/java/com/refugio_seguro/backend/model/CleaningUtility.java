package com.refugio_seguro.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = DatabaseConstants.CLEANINGUTILITY_TABLE_NAME)
public class CleaningUtility {
    @Id
    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_ID_NAME, nullable = false)
    private java.lang.Long id;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_WASHINGMACHINGDETERGENT_NAME)
    private java.lang.Integer washingMachingDetergent;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_DISHWASHERMACHINEDETERGENT_NAME)
    private java.lang.Integer dishwasherMachineDetergent;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_DISHWASHERSOAP_NAME)
    private java.lang.Integer dishwasherSoap;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_BLEACH_NAME)
    private java.lang.Integer bleach;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_AMMONIA_NAME)
    private java.lang.Integer ammonia;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_INSECTICIDE_NAME)
    private java.lang.Integer insecticide;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_WCCLEANINGSOAP_NAME)
    private java.lang.Integer wcCleaningSoap;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_TOILETCLEANINGSOAP_NAME)
    private java.lang.Integer toiletCleaningSoap;

    @Size(max = 4000)
    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_OTHER_NAME, length = 4000)
    private java.lang.String other;

}