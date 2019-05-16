package moviemanagement.service;

import java.util.List;


import javax.ejb.Stateless;
import javax.inject.Inject;

import moviemanagement.dataaccess.MovieDataAccess;
import moviemanagement.domain.Movie;
import moviemanagement.service.MovieService;

@Stateless
public class MovieServiceImplementation implements MovieService, MovieServiceLocal {
	//connecting our data access class 
	
	@Inject
	private MovieDataAccess dao;

	@Override
	public void addMovie(Movie movie) {
		dao.insert(movie);
	}

	@Override
	public List<Movie> getAllMovies() {
		return dao.findAll();
	}

	@Override
	public List<Movie> searchByMovieTitle(String title) {
		return dao.findByTitle(title);
	}

	
}
