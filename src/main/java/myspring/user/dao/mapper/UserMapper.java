package myspring.user.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import myspring.user.vo.UserVO;

@Mapper
public interface UserMapper {
	UserVO selectUserById(String userid);

	List<UserVO> selectUser();

	int insertUser(UserVO user);

	int updateUser(UserVO user);

	int deleteUser(int id);
}
