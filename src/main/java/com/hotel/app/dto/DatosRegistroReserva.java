package com.hotel.app.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hotel.app.model.FormaPago;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;
import java.util.Date;

public record DatosRegistroReserva(

        @NotBlank
        @JsonFormat(pattern="yyyy-MM-dd")
        Date fechaEntrada,
        @NotBlank
        @JsonFormat(pattern="yyyy-MM-dd")
        Date fechaSalida,
        @NotBlank
        @DecimalMin(value = "0.0", inclusive = true)
        BigDecimal valorEstadia,

        @NotBlank
        FormaPago formaPago


) {
}
