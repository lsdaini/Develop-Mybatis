package net.luis.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import net.luis.model.User;

/**
 * 开发原始dao：
 * 缺点：存在大量的模板方法
 * 调用sqlSession方法时将statement的id硬编码
 * 调用sqlSession方法时传入的变量，由于sqlsession使用的是泛型，即使变量类型错误，编译也不会报错
 * @author Roman
 *
 */
public class UserDaoImpl implements UserDao {
	//需要向dao注入SQLSessionFactory
	private SqlSessionFactory sqlSessionFactory;
	
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		super();
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public User findById(int id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		User user = sqlSession.selectOne("ibatis.findById", id);
		
		sqlSession.close();
		
		return user;
	}

	public void save(User user) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		sqlSession.insert("ibatis.save", user);
		
		sqlSession.commit();
		
		sqlSession.close();
		
	}

	public void delete(int id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		sqlSession.delete("ibatis.delete", id);
		
		sqlSession.commit();
		
		sqlSession.close();
	}

}
