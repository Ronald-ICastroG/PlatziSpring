package com.platzi.demo.persistence;

import com.platzi.demo.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoRepository productoRepository;

    public List<Producto> getAll(){
       return (List<Producto>) productoRepository.getAll();
    }


}
