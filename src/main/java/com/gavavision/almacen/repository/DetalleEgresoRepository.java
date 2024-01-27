package com.gavavision.almacen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gavavision.almacen.entity.DetalleEgreso;

@Repository
public interface DetalleEgresoRepository extends JpaRepository<DetalleEgreso, Integer>{

}
