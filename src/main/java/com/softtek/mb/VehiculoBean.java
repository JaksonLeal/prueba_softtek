/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.softtek.mb;

import com.softtek.dao.VehiculoDAO;
import com.softtek.entity.Vehiculo;
import com.softtek.repository.IVehiculo;
import javax.annotation.ManagedBean;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author jakle
 */
@Named("vehiculoBean")
@ManagedBean
@RequestScoped
public class VehiculoBean {

    private String placa;
    private String marca;
    private String modelo;
    private String cedulaCond;
    private String nombreCond;
    
    private IVehiculo vehiculoDAO;
    private Vehiculo v;
    
    public VehiculoBean() {
        vehiculoDAO = new VehiculoDAO();
        v = new Vehiculo();
    }
    
//    public String mens(){
//        return "hola";
//    }
    
    public void save(){
        
        v.setPlaca(this.placa);
        v.setMarca(this.marca);
        v.setModelo(this.modelo);
        v.setCedulaCond(this.cedulaCond);
        v.setNombreCond(this.nombreCond);
        v.setEstado(true); //optional

        vehiculoDAO.save(v); //save
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCedulaCond(String cedulaCond) {
        this.cedulaCond = cedulaCond;
    }

    public void setNombreCond(String nombreCond) {
        this.nombreCond = nombreCond;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCedulaCond() {
        return cedulaCond;
    }

    public String getNombreCond() {
        return nombreCond;
    }

}
