/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.softtek.repository;

import com.softtek.entity.Proveedor;
import java.util.List;

/**
 *
 * @author jakle
 */
public interface IProveedor {
    
    Proveedor save (Proveedor p);
    Proveedor edit (Proveedor p);
    Proveedor delete (int id);       
    Proveedor findById (int id);
    List <Proveedor> findByCeduNomb (String ceduNomb);
    List <Proveedor> proveedores(); 
}
