/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Farmacia.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import javax.print.attribute.standard.Media;
import lombok.Data;

@Data
@Entity
@Table(name = "medicamentos")
public class Medicamentos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private int id_categoria;

    public Medicamentos(String nombre, String descripcion, double precio, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
    
    public Long getId(){
        return this.id;
        
    }

    
    public Medicamentos() {
    }
    
  
}
