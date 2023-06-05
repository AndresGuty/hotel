package com.hotel.app.controller;

import com.hotel.app.dto.DatosRegistroHuesped;
import com.hotel.app.repository.EmpleadoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/huesped")
public class HuespedController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @PostMapping
    public void registrarHuesped(@RequestBody @Valid DatosRegistroHuesped datosRegistroHuesped){

        System.out.println("datosRegistroHuesped = " + datosRegistroHuesped);

    }
}
