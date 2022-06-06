/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softtek.test;

import com.softtek.dao.ProveedorDAO;
import com.softtek.entity.Proveedor;
import com.softtek.repository.IProveedor;

/**
 *
 * @author jakle
 */
public class TestProveedor {

    public static void main(String[] args) {

        IProveedor proveedorDAO = new ProveedorDAO();
        Proveedor p = new Proveedor();
        
/* test save  
        
        p.setNombre("jakson");
        p.setCedula("543210");
        p.setDireccion("calle 43 # 15 - 03");
        p.setCorreo("preuba@prueba.com");
        p.setTotalVehicDisp(758);
        
        proveedorDAO.save(p);   //save   
         */

 /* test edit
        
        p.setIdproveedor(1); //choose id
        p.setNombre("dario");
        p.setCedula("9874563210");
        p.setDireccion("calle 7 # 26-06");
        p.setCorreo("jleal@338.com");
        p.setTotalVehicDisp(400);
        
        proveedorDAO.edit(p);  //edit      
         */
 
 /* test delete
 
        p = proveedorDAO.delete(1); //choose id
        if (p == null) {
            System.out.println("vehiculo aun en base de datos");
        } else {
            System.out.println("vehiculo eliminado");
        }
         */

 /* test list
        
        for (Proveedor prov : proveedorDAO.proveedores()){
            System.out.println("proveedor: "+ prov.toString());
        } 
         */
 
 /*test findById
        
        p = proveedorDAO.findById(1); //choose id
        if (p == null) {
            System.out.println("no existe proveedor");
        }else{
            System.out.println("si existe proveedor"+ p.toString());
        }
         */
 
 /*test findByCeduNomb
        List<Proveedor> listProv = proveedorDAO.findByCeduNomb("jakn");  //choose nombre or  cedula
        if (listProv == null) {
            System.out.println("no existe");
        } else {
            System.out.println("proveedor: " + listProv.get(0).toString());
        }
         */
 
    }

}
