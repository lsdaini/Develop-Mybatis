package net.luis.dao;

import net.luis.model.User;

public interface UserDao {
	//根据id查询用户信息
	public User findById(int id);
	//添加用户信息
	public void save(User user);
	//删除用户信息
	public void delete(int id);
}
