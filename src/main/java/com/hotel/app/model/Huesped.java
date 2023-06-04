package com.hotel.app.model;

import jakarta.persistence.*;

@Entity
@Table(name="huespedes")
public class Huesped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_huespedes")
    private String id;

    @Column(name = "numero_cedulad")
    private String numeroDocumento;

    @Column(name = "nombre_huesped")
    private String nombreHuesped;

    @Column(name = "apellido_huesped")
    private String apellidoHuesped;


    private String nacionalidad;

    @Column(name = "telefono_huesped")
    private String telefonoHuesped;

    @Column(name = "correo_empleado")
    private String email;


}
