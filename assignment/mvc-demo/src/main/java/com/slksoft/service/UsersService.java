package com.slksoft.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.slksoft.dao.UsersDao;
import com.slksoft.entity.User;

public class UsersService {

	SqlSessionFactory factory;

	public UsersService() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		factory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	public void registerNewUser(User user) {
		// should do validation of user fields (TBD)
		try (SqlSession session = factory.openSession(true)) {
			UsersDao dao = session.getMapper(UsersDao.class);
			dao.addNewUser(user);
		}
	}
	
	public User loginUser(String email,String password) {
		
		try (SqlSession session = factory.openSession(true)) {
			UsersDao dao = session.getMapper(UsersDao.class);
			return dao.loginUser(email,password);
		}
		
		
	}
	
	
	public User updateDetails(String phone, String city,String country,String state,String email) {
		
		try (SqlSession session = factory.openSession(true)) {
			UsersDao dao = session.getMapper(UsersDao.class);
			return dao.updateDetails(phone,city,country,state,email);
		}
		
		
	}

}
