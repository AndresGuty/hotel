package com.hotel.app.controller;

import com.hotel.app.dto.DatosRegistroEmpleado;
import com.hotel.app.repository.EmpleadoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @PostMapping
    public void registrarEmpleado(@RequestBody @Valid DatosRegistroEmpleado datosRegistroEmpleado){

        System.out.println("datosRegistroEmpleado = " + datosRegistroEmpleado);

    }

}
