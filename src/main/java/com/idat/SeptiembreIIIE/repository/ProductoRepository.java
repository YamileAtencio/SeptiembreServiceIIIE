package com.idat.SeptiembreIIIE.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.SeptiembreIIIE.model.Producto;
//CRUD

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {


}
