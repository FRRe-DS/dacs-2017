/*
 * Copyright (C) 2017 UTN-FRRe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ar.edu.utn.frre.dacs.jaxrs.api;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ar.edu.utn.frre.dacs.jaxrs.dao.ProductoDao;

/**
 * @author Dr. Jorge Eduardo Villaverde
 *
 */
@Path("productos")
public class ProductoResources {

	@EJB
	private ProductoDao dao;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON}) 
	public Response list() {
		return Response.ok().entity(dao.findAll()).build();
	}
	
}
