package it.scai.camelcxfgirex.business;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import it.scai.camelcxfgirex.model.WorkElementResponse;

@Path("/api")
public class APIServiceImpl {

	@GET
	@Path("/servizio1/{name}/")
	@Produces({ MediaType.APPLICATION_JSON })
	public String getString(@PathParam("name") String name) {
		return null;
	}

	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/servizio2/{id}")
	public WorkElementResponse getWorkElement(@PathParam("id") String id) {
		return null;
	}

}
