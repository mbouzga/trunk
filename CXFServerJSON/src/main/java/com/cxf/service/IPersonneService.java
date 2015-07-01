/*
 * Copyright (c) 2014, Cube.
 */
package com.cxf.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.cxf.entity.Equipe;
import com.cxf.entity.Personne;

/**
 * @author Mountassir BOUZGA Open
 */

@Path("/personne/")
public interface IPersonneService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/idPersonne")
    public Personne getPersonneById(@QueryParam(value = "i") @DefaultValue("1") String id);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("allPersonne")
    public List<Personne> getAllPersonne();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/setPersonne")
    public Personne setPersonne(Personne personne);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/setListPersonne")
    public List<Personne> setListPersonne(List<Personne> personnes);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getEquipe")
    public Equipe getEquipeById(@QueryParam(value = "id") @DefaultValue("1") String id);

}
