/*
 * Copyright (c) 2014, Cube.
 */
package com.cxf.service;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.cxf.entity.Order;
import com.cxf.entity.OrderList;

/**
 * @author Mountassir BOUZGA Open
 */

@Path("/order/")
public interface SimpleService {
    @GET
    @Produces("application/xml")
    @Path("{orderId}")
    public Order getOrderXml(@PathParam("orderId") int id);

    @GET
    @Produces("application/json")
    @Path("/")
    public Order getOrderJson(@QueryParam("id") @DefaultValue("-1") String strId);

    @GET
    @Produces("application/json")
    @Path("all")
    public OrderList getAllOrders();
}
