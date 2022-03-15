package com.pompeu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.pompeu.domain.Member;

@Mapper
public interface MemberDao {

  int countAll();

  List<Member> findAll();

  int insert(Member member);

  Member findByNo(int no);

  int update(Member member);

  int delete(int no);

}




