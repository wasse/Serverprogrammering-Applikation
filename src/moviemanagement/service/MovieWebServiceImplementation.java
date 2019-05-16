package moviemanagement.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import moviemanagement.domain.Movie;

@Stateless
@WebService(name="MovieWebService")
public class MovieWebServiceImplementation {
	
//	TODO Lägg in resten
	
	@Inject 
	private MovieServiceLocal service;
	
	public void addMovie(Movie movie) {
		service.addMovie(movie);
	}
	
	public List<Movie> getAllMovies() {
		return service.getAllMovies();
	}
	
	public List<Movie> searchByMovieTitle(String title) {
		return service.searchByMovieTitle(title);
	}
	
}
