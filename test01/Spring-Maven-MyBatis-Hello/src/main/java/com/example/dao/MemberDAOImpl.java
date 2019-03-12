package com.example.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	private static final String Namespace = "com.example.mapper.memberMapper";
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<MemberVO> selectMember() throws Exception {

		return this.sqlSession.selectList(Namespace + ".selectMember");
	}

}
