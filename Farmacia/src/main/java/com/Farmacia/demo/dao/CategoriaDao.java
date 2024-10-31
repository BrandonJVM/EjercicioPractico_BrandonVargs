package com.Farmacia.demo.dao;

import com.Farmacia.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria, Long> {
    
}



