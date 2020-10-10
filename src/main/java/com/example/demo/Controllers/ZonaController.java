package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.Data.zonas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api")
public class ZonaController {

@Autowired
private  com.example.demo.Data.adm_Zona_repository adm_Zona_repository;
    
	@GetMapping("/zonas")
    public List<zonas> getAllZonas() {
        return adm_Zona_repository.findAll();
    }

    @GetMapping("/zona/{idZona}")
    public Optional<zonas> getzona(@PathVariable int idZona)
    {
        return adm_Zona_repository.findById(idZona);

    }
    

    @PostMapping("/zona")
    public zonas newZona(@RequestBody zonas newZona) {
        return adm_Zona_repository.save(newZona);
    }


    @GetMapping("/zonas?municipio={municipio}")
    public List<zonas> getforMunicipio(@PathVariable int municipio) {
      
        return adm_Zona_repository.findByMunicipio(municipio);
    }
  
   


}
