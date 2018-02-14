/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gt.restws_svc;

import com.gt.restws_dao.PaisDao;
import com.gt.restws_model.Pais;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * 
 * @author Erick Sandoval (kerikeden29@gmail.com)
 */
@Stateless
public class PaisSvcImpl implements PaisSvc{
    
   @Inject
   PaisDao paisDao;

    @Override
    public List<Pais> findAllPais() {
        return paisDao.findAllPais();
    }

    @Override
    public List<Pais> findAllPaisById(int id) {
        return paisDao.findAllPaisById(id);
    }

}
