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
@Table(name = DatabaseConstants.SESSION_TABLE_NAME)
public class Session {
    @Id
    @Column(name = DatabaseConstants.SESSION_COLUMN_ID_NAME, nullable = false)
    private java.lang.Long id;

    @Size(max = 255)
    @NotNull
    @Column(name = DatabaseConstants.SESSION_COLUMN_TOKEN_NAME, nullable = false)
    private java.lang.String token;

    @NotNull
    @Column(name = DatabaseConstants.SESSION_COLUMN_VALIDUNTIL_NAME, nullable = false)
    private java.time.Instant validUntil;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

}