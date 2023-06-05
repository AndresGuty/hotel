package com.hotel.app.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.hotel.app.dto.DatosRegistroReserva;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="reservas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_reserva")
    private Long idReserva;

    @Column(name = "fecha_entrada")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaEntrada;

    @Column(name = "fecha_salida")
    @JsonFormat(pattern="yyyy-MM-dd")
    private  Date fechaSalida;

    @Column(name = "valor_estadia")
    private BigDecimal valorEstadia;

    @Enumerated(EnumType.STRING)
    @Column(name = "forma_pago")
    private FormaPago formaPago;


    private Long idHuesped;

    private Long idEmpleado;


    @ManyToOne
    private Empleado empleado;

    @ManyToOne
    private  Huesped huesped;


    public Reserva(DatosRegistroReserva datosRegistroReserva) {

        this.fechaEntrada = datosRegistroReserva.fechaEntrada();
        this.fechaSalida = datosRegistroReserva.fechaSalida();
        this.valorEstadia = datosRegistroReserva.valorEstadia();
        this.formaPago = datosRegistroReserva.formaPago();
    }
}
