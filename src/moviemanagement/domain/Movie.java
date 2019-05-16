package moviemanagement.domain;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Movie implements Serializable{
 
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
	
}
