/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.restws_dao;

import com.gt.restws_model.Pais;
import java.util.List;

/**
 *
 * @author Erick Sandoval (kerikeden29@gmail.com)
 */
public interface PaisDao {
    List<Pais> findAllPais();
    List<Pais> findAllPaisById(int id);
    
}
