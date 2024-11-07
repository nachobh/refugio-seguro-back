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
@Table(name = DatabaseConstants.USER_TABLE_NAME)
public class User {
    @Id
    @Column(name = DatabaseConstants.USER_COLUMN_ID_NAME, nullable = false)
    private java.lang.Long id;

    @Size(max = 255)
    @NotNull
    @Column(name = DatabaseConstants.USER_COLUMN_NAME_NAME, nullable = false)
    private java.lang.String name;

    @Size(max = 255)
    @NotNull
    @Column(name = DatabaseConstants.USER_COLUMN_EMAIL_NAME, nullable = false)
    private java.lang.String email;

    @Size(max = 45)
    @NotNull
    @Column(name = DatabaseConstants.USER_COLUMN_PASSWORD_NAME, nullable = false, length = 45)
    private java.lang.String password;

}