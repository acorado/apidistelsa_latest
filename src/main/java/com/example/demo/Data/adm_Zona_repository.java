package com.example.demo.Data;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
public interface adm_Zona_repository extends JpaRepository<zonas, Integer>{

	List<zonas> findByMunicipio(int municipio);
    
}
