package net.luis.mapper;

import java.util.List;

import net.luis.model.User;
/**
 * Mapper编写规范：
 * 1、在mapper.xml中namespace要与mapper接口地址一致
 * 2、mapper.java接口中的方法名要与mapper.xml中的statement的id一致
 * 3、mapper.java接口中的方法输入参数类型要与mapper.xml中的statement的parameterType指定的类型一致
 * 4、mapper.java接口中的方法返回值类型要与mapper.xml中的statement的resultType指定的类型一致
 * @author Roman
 *
 */
public interface UserMapper {
	//添加用户信息
	public void save(User user);
	public boolean update(User user);
	//删除用户信息
	public boolean delete(int id);
	//根据id查询用户信息
	public User findById(int id);
	public List<User> findAll();
}
