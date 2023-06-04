package com.hotel.app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="huespedes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Huesped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_huespedes")
    private Long idHuesped;

    @Column(name = "numero_cedulad")
    private String numeroDocumento;

    @Column(name = "nombre_huesped")
    private String nombreHuesped;

    @Column(name = "apellido_huesped")
    private String apellidoHuesped;


    private String nacionalidad;

    @Column(name = "telefono_huesped")
    private String telefonoHuesped;

    @Column(name = "correo_huesped")
    private String email;


}
