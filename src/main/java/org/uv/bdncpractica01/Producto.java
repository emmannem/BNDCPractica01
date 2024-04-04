/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.bdncpractica01;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author JMRes
 */
@Entity
@Table(name = "producto")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "producto_idproducto_seq")
    @SequenceGenerator(name = "producto_idproducto_seq",
            sequenceName = "producto_idproducto_seq",
            allocationSize = 1,
            initialValue = 1)
    @Column(name = "idproducto")
    private long id;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precioventa")
    private double precioventa;
    @Column(name = "preciocompra")
    private double preciocompra;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precioventa
     */
    public double getPrecioventa() {
        return precioventa;
    }

    /**
     * @param precioventa the precioventa to set
     */
    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    /**
     * @return the preciocompra
     */
    public double getPreciocompra() {
        return preciocompra;
    }

    /**
     * @param preciocompra the preciocompra to set
     */
    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }
    
    
}
