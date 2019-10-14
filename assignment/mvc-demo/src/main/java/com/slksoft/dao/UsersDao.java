package com.slksoft.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.slksoft.entity.User;

public interface UsersDao {
	
	
	@Insert("insert into users(name,gender,email,phone,password,created_at) values(#{name},#{gender},#{email},#{phone},md5(#{password}),#{createdAt})")
	public void addNewUser(User user);
	
	
	@Select("select * from users where email = #{e} and password = md5(#{pass})")
	public User loginUser(@Param("e") String email, @Param("pass") String password);
	

	@Update("update users set phone = #{p} ,city = #{ci}, country= #{c} , state = #{s} where email= #{e} ")
	@Select("select * from users where email = #{e}")
	public User updateDetails(@Param("p") String phone, @Param("ci") String city, @Param("c") String country, @Param("s") String state, @Param("e") String email);
}
