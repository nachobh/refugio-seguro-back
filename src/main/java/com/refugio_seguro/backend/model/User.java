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
@Table(name = DatabaseConstants.USER_TABLE_NAME)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DatabaseConstants.USER_COLUMN_ID_NAME, nullable = false)
    private Long id;

    @Size(max = 255)
    @NotNull
    @Column(name = DatabaseConstants.USER_COLUMN_NAME_NAME, nullable = false)
    private String name;

    @Size(max = 255)
    @NotNull
    @Column(name = DatabaseConstants.USER_COLUMN_EMAIL_NAME, nullable = false)
    private String email;

    @Size(max = 45)
    @NotNull
    @Column(name = DatabaseConstants.USER_COLUMN_PASSWORD_NAME, nullable = false, length = 45)
    private String password;

}