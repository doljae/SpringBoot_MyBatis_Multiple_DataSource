package myspring.user.movie.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.user.movie.dao.mapper.MovieMapper;
import myspring.user.movie.vo.MovieVo;

@Repository
public class MovieDaoImpl implements MovieDao {
	@Autowired
	MovieMapper mapper;

	@Override
	public MovieVo getMovie(String title) {
		return mapper.selectMovieById(title);
	}

	@Override
	public List<MovieVo> getMovies() {
		return mapper.selectMovies();
	}

	@Override
	public int addMovie(MovieVo m) {
		return mapper.insertMovie(m);
	}

}
