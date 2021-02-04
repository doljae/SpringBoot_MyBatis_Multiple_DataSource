package myspring.user.movie.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import myspring.user.movie.vo.MovieVo;

@Mapper
public interface MovieMapper {
	public MovieVo selectMovieById(String title);

	public List<MovieVo> selectMovies();

	public int insertMovie(MovieVo m);

}
