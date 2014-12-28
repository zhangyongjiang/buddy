package com.gaoshin.buddy.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
@Path("free-stuff")
public class FreeStuffAPI {

	@Path("create")
	@GET
	public String create() {
		return "free stuff created";
	}
	
}
