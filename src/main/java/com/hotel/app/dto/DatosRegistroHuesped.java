package com.hotel.app.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;


public record DatosRegistroHuesped(


        @NotBlank
        @Pattern(regexp = "\\d{7,10}")
        String numeroDocumento,

        @NotBlank
        String nombreHuesped,

        @NotBlank
        String apellidoHuesped,

        @NotBlank
        String nacionalidad,

        @NotBlank
        @Pattern(regexp = "\\d{7,11}")
        String telefonoHuesped,

        @NotBlank
        @Email
        String email


) {
}
