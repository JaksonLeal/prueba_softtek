/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softtek.dao;

import com.softtek.db.ConexionJPA;
import com.softtek.entity.Proveedor;
import com.softtek.repository.IProveedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author jakle
 */
public class ProveedorDAO implements IProveedor {

    private EntityManager em = null;

    public ProveedorDAO() {
        em = ConexionJPA.createEntityManager(); //connection to database
    }

    @Override
    public Proveedor save(Proveedor p) {

        try {
            em.getTransaction().begin(); //star connection
            em.persist(p); //save information
            em.getTransaction().commit(); //execute
        } finally {
            ConexionJPA.desconexion(em);//closure connection
        }
        return p;

    }

    @Override
    public Proveedor edit(Proveedor p) {

        try {
            Proveedor prove = em.find(Proveedor.class, p.getIdproveedor()); //find by id
            em.getTransaction().begin();
            if (em.contains(prove)) { //check if prove is in the database
                em.merge(p); //update information
                em.getTransaction().commit();
                System.out.println("editado");
            } else {
                System.out.println("no existe");
            }
        } finally {
            ConexionJPA.desconexion(em);
        }
        return p;

    }

    @Override
    public Proveedor delete(int id) {

        Proveedor p = em.find(Proveedor.class, id);
        em.getTransaction().begin();
        try {
            if (p != null) { //check if p is different null
                em.remove(p); //temove p in the database
                em.getTransaction().commit();
            }
        } finally {
            ConexionJPA.desconexion(em);
        }
        return p;
        
    }

    @Override
    public List <Proveedor> proveedores() {

        List <Proveedor> listProveedores = null;
        try {
            Query query = em.createNamedQuery("Proveedor.findAll"); //databbase query
            listProveedores = query.getResultList(); //transform result
        } finally {
            ConexionJPA.desconexion(em);
        }
        return listProveedores;

    }

    @Override
    public Proveedor findById(int id) {

        try {
            return em.find(Proveedor.class, id);
        } finally {
            ConexionJPA.desconexion(em);
        }

    }

    @Override
    public List<Proveedor> findByCeduNomb(String ceduNomb) {

        List<Proveedor> listProv;
        try {
            Query query = em.createNamedQuery("Proveedor.findByCedu"); //database query
            query.setParameter("cedu", ceduNomb); //assign value to cedu
            query.setParameter("nomb", ceduNomb); //assign value to nomb
            listProv = query.getResultList();
            if (listProv.isEmpty()) { //check if listProv is empty
                System.out.println("no existe proveedor");
                return null;
            }
        } finally {
            ConexionJPA.desconexion(em);
        }
        return listProv;

    }

}
