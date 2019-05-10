package moviemanagement.service;

import java.util.List;

import javax.ejb.Remote;

import moviemanagement.domain.Movie;

@Remote
public interface MovieService {

	public void addMovie(Movie movie);
	public List<Movie> getAllMovies();
	public List<Movie> searchByMovieTitle(String title);
}
