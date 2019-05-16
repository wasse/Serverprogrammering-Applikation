package moviemanagement.service;

import java.util.List;

import javax.ejb.Local;

import moviemanagement.domain.Movie;

@Local
public interface MovieServiceLocal {
//	TODO Lägg till resten
	
	public void addMovie(Movie movie);
	public List<Movie> getAllMovies();
	public List<Movie> searchByMovieTitle(String title);
	
}
