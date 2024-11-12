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
@Table(name = DatabaseConstants.CLEANINGUTILITY_TABLE_NAME)
public class CleaningUtility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_ID_NAME, nullable = false)
    private Long id;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_WASHINGMACHINGDETERGENT_NAME)
    private Integer washingMachingDetergent;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_DISHWASHERMACHINEDETERGENT_NAME)
    private Integer dishwasherMachineDetergent;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_DISHWASHERSOAP_NAME)
    private Integer dishwasherSoap;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_BLEACH_NAME)
    private Integer bleach;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_AMMONIA_NAME)
    private Integer ammonia;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_INSECTICIDE_NAME)
    private Integer insecticide;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_WCCLEANINGSOAP_NAME)
    private Integer wcCleaningSoap;

    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_TOILETCLEANINGSOAP_NAME)
    private Integer toiletCleaningSoap;

    @Size(max = 4000)
    @Column(name = DatabaseConstants.CLEANINGUTILITY_COLUMN_OTHER_NAME, length = 4000)
    private String other;

}