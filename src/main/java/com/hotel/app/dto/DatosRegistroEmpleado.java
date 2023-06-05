package com.hotel.app.dto;

import com.hotel.app.model.Rol;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


public record DatosRegistroEmpleado(

        @NotBlank
        @Pattern(regexp = "\\d{1,10}")
        String numeroDocumento,



        @NotBlank
        String nombreEmpleado,

        @NotBlank
        String apellidoEmpleado,

        @Email
        @NotBlank
        String email,

        @NotBlank
        String password,

        @NotBlank
        Rol rol


) {
}
