package net.luis.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Before;
//import org.junit.Test;

import net.luis.mapper.UserMapper;
import net.luis.model.User;

public class UserDaoImplTest {
	private SqlSessionFactory sqlSessionFactory;
	//@Before
	public void setUp() throws Exception {
		//mybatis配置文件
		String resource = "config/mybatis_config.xml";
		//得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//创建会话工厂，传入mybatis配置信息 
	    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); 
	}

	//@Test
	public void testFindById() {
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		User user1 = userDao.findById(1);
		System.out.println(user1);
		
//		SqlSession sqlSession =  sqlSessionFactory.openSession();
		//创建UserMapper对象，mybatis自动生成mapper代理对象
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		User user2 = userMapper.findById(1);
//		System.out.println(user2);
	}
}
