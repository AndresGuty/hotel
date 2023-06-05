package com.hotel.app.controller;

import com.hotel.app.dto.DatosRegistroReserva;
import com.hotel.app.model.Reserva;
import com.hotel.app.repository.ReservaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;


    @PostMapping
    public void registrarReserva(@RequestBody @Valid DatosRegistroReserva datosRegistroReserva){

            reservaRepository.save(new Reserva(datosRegistroReserva));


    }
}
