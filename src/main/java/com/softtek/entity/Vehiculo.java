/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softtek.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jakle
 */
@Entity
@Table(name = "vehiculo")
@NamedQueries({
    @NamedQuery(name = "Vehiculo.findAll", query = "SELECT v FROM Vehiculo v"),
    @NamedQuery(name = "Vehiculo.findByPlacCedu" , 
            query = "SELECT v FROM Vehiculo v WHERE v.placa = :plac OR v.cedulaCond = :ceduCond")
})
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvehiculo")
    private Integer idvehiculo;
    @Basic(optional = false)
    @Column(name = "placa")
    private String placa;
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @Column(name = "CedulaCond")
    private String cedulaCond;
    @Basic(optional = false)
    @Column(name = "nombreCond")
    private String nombreCond;
    @Basic(optional = false)
    @Column(name = "estado")
    private boolean estado;

    public Vehiculo() {
    }

    public Vehiculo(Integer idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public Vehiculo(Integer idvehiculo, String placa, String marca, String modelo, String cedulaCond, String nombreCond, boolean estado) {
        this.idvehiculo = idvehiculo;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cedulaCond = cedulaCond;
        this.nombreCond = nombreCond;
        this.estado = estado;
    }

    public Integer getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(Integer idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCedulaCond() {
        return cedulaCond;
    }

    public void setCedulaCond(String cedulaCond) {
        this.cedulaCond = cedulaCond;
    }

    public String getNombreCond() {
        return nombreCond;
    }

    public void setNombreCond(String nombreCond) {
        this.nombreCond = nombreCond;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvehiculo != null ? idvehiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.idvehiculo == null && other.idvehiculo != null) || (this.idvehiculo != null && !this.idvehiculo.equals(other.idvehiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idvehiculo=" + idvehiculo + ", placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", cedulaCond=" + cedulaCond + ", nombreCond=" + nombreCond + ", estado=" + estado + '}';
    }
    
}
