package com.gavavision.almacen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gavavision.almacen.entity.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{

}
