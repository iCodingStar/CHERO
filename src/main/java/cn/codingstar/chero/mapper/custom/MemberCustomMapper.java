package cn.codingstar.chero.mapper.custom;

import cn.codingstar.chero.model.persistence.Member;

public interface MemberCustomMapper {

    Member selectByMemberName(String memberName);

    Member selectByMember(Member member);
}