package br.com.fiap.irrigationapi.modules.areas.controllers;

import br.com.fiap.irrigationapi.modules.areas.services.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/areas")
public class AreaController {

    @Autowired
    private AreaService service;


    // TO DO: Implements routes

}