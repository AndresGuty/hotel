package com.hotel.app.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_reserva")
    private Long id;

    @Column(name = "fecha_entrada")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaEntrada;

    @Column(name = "fecha_salida")
    @JsonFormat(pattern="yyyy-MM-dd")
    private  Date fechaSalida;

    @Column(name = "valor_estadia")
    private BigDecimal valorEstadia;

    @Column(name = "forma_pago")
    private FormaPago formaPago;


    private Long idHuesped;

    private Long idEmpleado;



}
