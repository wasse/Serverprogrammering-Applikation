package moviemanagement.dataaccess;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import moviemanagement.domain.Movie;

@Stateless
public class MovieDataAccessProductionVersion implements MovieDataAccess{
	@PersistenceContext //entity manager annotation,, tells wildfly once the ejb has been deployed, wildfly must create a fresh e manager evrytime a method in this class is called 
	private EntityManager em;

	@Override
	public void insert(Movie newMovie) {
		em.persist(newMovie);
	}

	@Override
	public List<Movie> findAll() {
		
		Query q = em.createQuery("select movie from Movie movie");
		List<Movie> movies = q.getResultList(); //returns list of movie objects
		return movies;
	}

	@Override
	public List<Movie> findByTitle(String title) {
		Query q = em.createQuery("select movie from Movie movie where movie.title = :title");
		q.setParameter("title", title);
		return q.getResultList(); //returns list of movies
	}

}
