package com.gavavision.almacen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gavavision.almacen.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
