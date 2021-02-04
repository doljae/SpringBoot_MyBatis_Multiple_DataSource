package myspring.user.member.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.user.member.dao.mapper.MemberMapper;
import myspring.user.member.vo.MemberVo;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	MemberMapper mapper;

	@Override
	public MemberVo selectMember(String name) {
		return mapper.selectMember(name);
	}

}
