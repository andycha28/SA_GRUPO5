/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gt.restws_dao;

import com.gt.restws_model.Pais;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * 
 * @author Erick Sandoval (kerikeden29@gmail.com)
 */
@Stateless
public class PaisDaoImpl implements PaisDao{
    
    @PersistenceContext(unitName = "com.gt_restWs_model")
    private EntityManager em;

    @Override
    public List<Pais> findAllPaisById(int id) {
        TypedQuery<Pais> runsql = em.createNamedQuery("Pais.findById", Pais.class);
        runsql.setParameter("id", id);
        return runsql.getResultList();
    }

    @Override
    public List<Pais> findAllPais() {
        TypedQuery<Pais> runsql = em.createNamedQuery("Pais.findAll", Pais.class);
        return runsql.getResultList();
    }

}
