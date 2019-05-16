package moviemanagement.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import moviemanagement.domain.Movie;
import moviemanagement.service.MovieServiceLocal;

@Stateless
@Path("/movies")
public class MovieResource {
	
//	TODO Lägg till resten
	
	@Inject
	private MovieServiceLocal service;
	
	@POST
	@Produces({"application/XML", "application/JSON"})
	@Consumes({"application/XML", "application/JSON"})
	public Response addMovie(Movie movie) {
		try {
			service.addMovie(movie);
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(504).build();
		}
		return Response.status(201).build();
	}
	
	@GET
	@Produces ("application/XML")
	public List<Movie> getAllMovies(){
		return service.getAllMovies();
	}
	
}
