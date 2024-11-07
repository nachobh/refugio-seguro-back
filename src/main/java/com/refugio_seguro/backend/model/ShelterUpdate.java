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
@Table(name = DatabaseConstants.SHELTERUPDATE_TABLE_NAME)
public class ShelterUpdate {
    @Id
    @Column(name = DatabaseConstants.SHELTERUPDATE_COLUMN_ID_NAME, nullable = false)
    private java.lang.Long id;

    @Size(max = 4000)
    @Column(name = DatabaseConstants.SHELTERUPDATE_COLUMN_SHELTERFROM_NAME, length = 4000)
    private java.lang.String shelterFrom;

    @Size(max = 4000)
    @Column(name = DatabaseConstants.SHELTERUPDATE_COLUMN_SHELTERTO_NAME, length = 4000)
    private java.lang.String shelterTo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SHELTER_ID", nullable = false)
    private Shelter shelter;

}