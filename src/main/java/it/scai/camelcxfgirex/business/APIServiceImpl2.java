package it.scai.camelcxfgirex.business;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import it.scai.camelcxfgirex.model.WorkElementResponse;

@Path("/api2")
public class APIServiceImpl2 {

	@GET
	@Path("/servizio1/en/{name}/")
	@Produces({ MediaType.APPLICATION_JSON })
	public String getStringEn(@PathParam("name") String name) {
		return null;
	}

	@GET
	@Path("/servizio1/it/{name}/")
	@Produces({ MediaType.APPLICATION_JSON })
	public String getStringIt(@PathParam("name") String name) {
		return null;
	}	

}
