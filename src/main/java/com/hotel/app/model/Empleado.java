package com.hotel.app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "empleados")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleados")
    private Long idEmpleado;

    @Column(name = "numero_cedulad")
    private String numeroDocumento;

    @Column(name = "nombre_empleado")
    private String nombreEmpleado;

    @Column(name = "apellido_empleado")
    private String apellidoEmpleado;


    @Column(name = "correo_empleado")
    private String email;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    private String password;

    private Long idReserva;

    @OneToMany
    @JoinColumn(name="idReserva")
    List<Reserva> reserva;

}
