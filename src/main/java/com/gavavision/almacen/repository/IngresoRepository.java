package com.gavavision.almacen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gavavision.almacen.entity.Ingreso;

@Repository
public interface IngresoRepository extends JpaRepository<Ingreso, Integer>{

}
