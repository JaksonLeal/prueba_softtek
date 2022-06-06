/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.softtek.repository;

import com.softtek.entity.Vehiculo;
import java.util.List;

/**
 *
 * @author jakle
 */
public interface IVehiculo {
    
    Vehiculo save (Vehiculo v);
    Vehiculo edit (Vehiculo v);
    Vehiculo delete (int id);
    Vehiculo findById (int id);
    List <Vehiculo> findByPlacCedu(String placaCedu);
    List <Vehiculo> vehiculos();
}
