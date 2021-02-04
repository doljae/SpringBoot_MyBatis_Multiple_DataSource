package myspring.user.member.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import myspring.user.member.vo.MemberVo;

@Mapper
public interface MemberMapper {
	public MemberVo selectMember(String name);
}
