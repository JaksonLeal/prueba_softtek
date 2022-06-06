/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softtek.db;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author jakle
 */
public class ConexionJPA {

    private static EntityManagerFactory emf = null;

    public static EntityManager createEntityManager() { //create em

        try {
            if (emf == null) {
                emf = Persistence.createEntityManagerFactory("softtekPU"); //create persistence
            }
        } catch (Exception e) {
            System.out.println("valor de emf: " + emf + ". " + "Error de conexion: " + e.getMessage());
        }
        return emf.createEntityManager();
    }

    public static void desconexion(EntityManager em) {
        if (em != null) {
            em.close(); //closure connection
            emf.close(); //closure connection
        }
    }

}
