/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softtek.test;

import com.softtek.dao.VehiculoDAO;
import com.softtek.entity.Vehiculo;
import com.softtek.repository.IVehiculo;
import java.util.List;

/**
 *
 * @author jakle
 */
public class TestVehiculo {

    public static void main(String[] args) {

        IVehiculo vehiculoDAO = new VehiculoDAO();
        Vehiculo v = new Vehiculo();

 /*test save
      
        v.setPlaca("asd123");
        v.setMarca("mazda");
        v.setModelo("2020");
        v.setCedulaCond("6547");
        v.setNombreCond("prueba4");
        v.setEstado(true);

        vehiculoDAO.save(v); //save
         */

 /* test edit
        
        v.setIdvehiculo(1); //choose id
        v.setPlaca("asd123");
        v.setMarca("mazda");
        v.setModelo("2020");
        v.setCedulaCond("1234");
        v.setNombreCond("prueba2");
        v.setEstado(true);

        vehiculoDAO.edit(v); //edit
         */
 
 /* test delete
 
         v = vehiculoDAO.delete(1); //choose id
        if (v == null) {
            System.out.println("vehiculo aun en base de datos");
        } else {
            System.out.println("vehiculo eliminado");
        }
         */
 
 /* test list
        
        for (Vehiculo vehic : vehiculoDAO.vehiculos()){
            System.out.println("vehiculo: "+ vehic.toString());
        }
         */
 
 /*test findById
        
        v = vehiculoDAO.findById(1); //choose id
        if (v == null) {
            System.out.println("no existe vehiculo");
        }else{
            System.out.println("si existe vehiculo"+ v.toString());
        }
         */
 
 /* test findByPlacCedu
 
        List <Vehiculo> listVehi = vehiculoDAO.findByPlacCedu("asd123"); //choose placa or cedula
        if (listVehi == null) {
            System.out.println("no existe");
        } else {
            System.out.println("vehiculo: " + listVehi.get(0).toString());
        }
         */
 
    }

}
