package moviemanagement.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie implements java.io.Serializable{
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private static final long serialVersionUID = 1l;
	private String title;
	private int year;
	private String genre;
	
	public Movie() {
		//empty constructor required by JPA
	}
	
	public Movie(String title, int year, String genre) {
		super();
		this.title = title;
		this.year = year;
		this.genre = genre;
		
	}
	
	
	public String toString() {
		return this.title + " : " + this.year + " : " + this.genre;
	}
	
	
}
