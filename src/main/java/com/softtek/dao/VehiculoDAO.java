/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softtek.dao;

import com.softtek.db.ConexionJPA;
import com.softtek.entity.Vehiculo;
import com.softtek.repository.IVehiculo;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.TemporalType;

/**
 *
 * @author jakle
 */
public class VehiculoDAO implements IVehiculo {

    private EntityManager em = null;

    public VehiculoDAO() {
        em = ConexionJPA.createEntityManager(); //connection to database
    }

    @Override
    public Vehiculo save(Vehiculo v) {

        try {
            em.getTransaction().begin(); //star connection
            em.persist(v); //save information
            em.getTransaction().commit(); //execute
        } finally {
            ConexionJPA.desconexion(em);//closure connection
        }
        return v;
        
    }

    @Override
    public Vehiculo edit(Vehiculo v) {

        try {
            Vehiculo vehic = em.find(Vehiculo.class, v.getIdvehiculo()); //find by id
            em.getTransaction().begin();
            if (em.contains(vehic)) { //check if prove is in the database
                em.merge(v); //update  information
                em.getTransaction().commit();
                System.out.println("editado");
            } else {
                System.out.println("no existe");
            }
        } finally {
            ConexionJPA.desconexion(em);
        }
        return v;
        
    }
    
    @Override
    public Vehiculo delete (int id) {
        
        Vehiculo v = em.find(Vehiculo.class, id);
        em.getTransaction().begin();
        try {
            if (v != null) { //check if V is different null
                em.remove(v); //temove p in the database
                em.getTransaction().commit();
            }          
        } finally {
            ConexionJPA.desconexion(em);
        } 
        return v;
    }

    @Override
    public List<Vehiculo> vehiculos() {

        List<Vehiculo> listVehiculos = null;
        try {
            Query query = em.createNamedQuery("Vehiculo.findAll"); //database query
            listVehiculos = query.getResultList(); //transform result
        } finally {
            ConexionJPA.desconexion(em);
        }
        return listVehiculos;
    }

    @Override
    public Vehiculo findById(int id) {

        try {
            return em.find(Vehiculo.class, id);
        } finally {
            ConexionJPA.desconexion(em);
        }

    }

    @Override
    public List<Vehiculo> findByPlacCedu(String placaCedu) {

        List<Vehiculo> listVehi;
        try {
            Query query = em.createNamedQuery("Vehiculo.findByPlacCedu"); //database query
            query.setParameter("plac",placaCedu); //assign value to plac
            query.setParameter("ceduCond",placaCedu);//assign value to ceduCond
            listVehi = query.getResultList();
            if (listVehi.isEmpty()) { //check if listVehi is empty
                System.out.println("no existe vehiculo");
                return null;
            }
        } finally{
            ConexionJPA.desconexion(em);
        }    
        return listVehi;
    }
}
