package myspring.user.member.dao;

import myspring.user.member.vo.MemberVo;

public interface MemberDao {
	public MemberVo selectMember(String name);
}
