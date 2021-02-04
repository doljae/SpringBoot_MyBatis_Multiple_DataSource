package myspring.user.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.user.dao.mapper.UserMapper;
import myspring.user.vo.UserVO;

@Repository
public class UserDAOImpl2 implements IUserDAO {
//	@Autowired
//	private final SqlSession session;
//	// final 변수는 객체 생성 시 붙여줘야함
//	public UserDAOImpl2(SqlSession session) {
//		this.session = session;
//	}
	@Autowired
	private UserMapper mapper;

	public UserDAOImpl2() {
		System.out.println("UserDao 기본생성자 호출됨");
	}

	@Override
	public UserVO getUser(String userid) {
		System.out.println("메소드가 호출됨1");
		UserVO user = mapper.selectUserById(userid);
		System.out.println(mapper.toString());
		return user;
	}

	@Override
	public List<UserVO> getUsers() {
		System.out.println("메소드가 호출됨2");
		List<UserVO> users = mapper.selectUser();
		return users;
	}

	@Override
	public int insertUser(UserVO user) {
		int cnt = mapper.insertUser(user);
		return cnt;
	}

	@Override
	public int updateUser(UserVO user) {
		int cnt = mapper.updateUser(user);
		return cnt;
	}

	@Override
	public int deleteUser(int id) {
		int cnt = mapper.deleteUser(id);
		return cnt;
	}

}
