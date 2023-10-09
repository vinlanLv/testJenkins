package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;


	public void test(){
		jdbcTemplate.execute("insert into user values (1,1)");
		System.out.println("111");
	}

	public String getUserId(int id){
		System.out.println("getUserById(" + id + ")...");
		// 等待2秒
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		return "hangge";
	}

}
