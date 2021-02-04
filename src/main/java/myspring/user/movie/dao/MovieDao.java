package myspring.user.movie.dao;

import java.util.List;

import myspring.user.movie.vo.MovieVo;

public interface MovieDao {
	public MovieVo getMovie(String title);

	public List<MovieVo> getMovies();

	public int addMovie(MovieVo m);
}
