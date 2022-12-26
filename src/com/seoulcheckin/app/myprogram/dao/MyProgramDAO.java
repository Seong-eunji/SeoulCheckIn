package com.seoulcheckin.app.myprogram.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.seoulcheckin.mybatis.config.MyBatisConfig;

public class MyProgramDAO {
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlSessionFactory();
	SqlSession sqlSession;
	
	public MyProgramDAO() {
		sqlSession = sqlSessionFactory.openSession(true);
	}
	
	public int myClassCount(int memberNumber) {
		return sqlSession.selectOne("MyProgram.myClassCount", memberNumber);
	}
	
	public int classLimitCount(int schoolNumber) {
		return sqlSession.selectOne("MyProgram.classLimitCount", schoolNumber);
	}
	
	public void insert(MyProgramDTO myprogramDTO) {
		return sqlSession.insert("MyProgram.insert", myprogramDTO);
	}
	
}
