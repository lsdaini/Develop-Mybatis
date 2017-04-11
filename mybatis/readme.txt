1、访问路径：localhost:8080/mybatis/
2、数据库配置，一定要和自己的设置一样
<property name="driverClassName" value="com.mysql.jdbc.Driver" />
<property name="url" value="jdbc:mysql://localhost:3306/mybatis" />
<property name="username" value="root" />
<property name="password" value="123456" />
3、jdk需要1.6以上
4、项目需要运行在tomcat等服务器上

CREATE DATABASE IF NOT EXISTS mybatis;  
USE mybatis;  
create table t_user  
(  
    user_id int(11) NOT NULL AUTO_INCREMENT,  
    user_name varchar(20) not null,  
    user_age varchar(20) not null,  
    PRIMARY KEY (user_id)  
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

