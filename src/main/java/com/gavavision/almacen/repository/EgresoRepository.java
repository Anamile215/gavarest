package com.gavavision.almacen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gavavision.almacen.entity.Egreso;

@Repository
public interface EgresoRepository extends JpaRepository<Egreso, Integer> {

}
