package myspring.user.runner;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import myspring.user.member.dao.mapper.MemberMapper;
import myspring.user.movie.dao.mapper.MovieMapper;

@Component
public class DBRunner implements ApplicationRunner {

	@Autowired
	@Qualifier("sqlSessionTemplate1")
	private SqlSession s1;

	@Autowired
	@Qualifier("sqlSessionTemplate2")
	private SqlSession s2;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		MovieMapper m1 = s1.getMapper(MovieMapper.class);
		System.out.println(m1.selectMovieById("미나리"));
		MemberMapper m2 = s2.getMapper(MemberMapper.class);
		System.out.println(m2.selectMember("seokjae"));

	}

}
