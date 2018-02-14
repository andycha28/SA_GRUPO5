/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.restws_web;

import com.gt.restws_model.Pais;
import com.gt.restws_svc.PaisSvc;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Erick Sandoval (kerikeden29@gmail.com)
 */
@Path("admpais")
@Stateless
public class PaisRs {

    @Inject
    PaisSvc paisSvc;

    @GET
    @Path("findAllPais")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pais> findAllPais() {
        return paisSvc.findAllPais();
    }

    @GET
    @Path("findByIdPais/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pais> findByIdPais(@PathParam("id") int id) {
        return paisSvc.findAllPaisById(id);
    }

}
