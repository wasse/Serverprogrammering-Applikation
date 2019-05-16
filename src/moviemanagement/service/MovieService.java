package moviemanagement.service;

import java.util.List;

import javax.ejb.Remote;

import moviemanagement.domain.Movie;

@Remote
public interface MovieService extends MovieServiceLocal{

}
