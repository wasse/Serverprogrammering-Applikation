package moviemanagement.dataaccess;

import java.util.List;

import javax.ejb.Local;

import moviemanagement.domain.Movie;

@Local
public interface MovieDataAccess {
	public void insert (Movie newMovie);
	public List<Movie> findAll();
	public List<Movie> findByTitle(String title);

}
