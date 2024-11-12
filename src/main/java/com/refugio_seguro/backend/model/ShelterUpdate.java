package com.refugio_seguro.backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = DatabaseConstants.SHELTERUPDATE_TABLE_NAME)
public class ShelterUpdate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DatabaseConstants.SHELTERUPDATE_COLUMN_ID_NAME, nullable = false)
    private Long id;

    @Size(max = 4000)
    @Column(name = DatabaseConstants.SHELTERUPDATE_COLUMN_SHELTERFROM_NAME, length = 4000)
    private String shelterFrom;

    @Size(max = 4000)
    @Column(name = DatabaseConstants.SHELTERUPDATE_COLUMN_SHELTERTO_NAME, length = 4000)
    private String shelterTo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SHELTER_ID", nullable = false)
    private Shelter shelter;

}