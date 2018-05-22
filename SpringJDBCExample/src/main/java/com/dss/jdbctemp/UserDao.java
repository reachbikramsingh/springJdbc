package com.dss.jdbctemp;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveUser(User u) {
		String query = "insert into user values('" + u.getId() + "','" + u.getName() + "','" + u.getSalary() + "')";
		return jdbcTemplate.update(query);
	}

	public int updateUser(User u) {
		String query = "update user set name='" + u.getName() + "',salary='" + u.getSalary() + "' where id='"
				+ u.getId() + "' ";
		return jdbcTemplate.update(query);
	}

	public int deleteUser(User u) {
		String query = "delete from user where id='" + u.getId() + "' ";
		return jdbcTemplate.update(query);
	}
}
