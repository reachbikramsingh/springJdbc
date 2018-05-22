package com.dss.namedParameterJdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class UserDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public  void save (User u){  
		String query="insert into User values (:id,:name,:salary)";  
		  
		Map<String,Object> map=new HashMap<String,Object>();  
		map.put("id",u.getId());  
		map.put("name",u.getName());  
		map.put("salary",u.getSalary());  
		  
//		jdbcTemplate.execute(query,map,new PreparedStatementCallback() {  
//		    @Override  
//		    public Object doInPreparedStatement(PreparedStatement ps)  
//		            throws SQLException, DataAccessException {  
//		        return ps.executeUpdate();  
//		    }  
//		});  
		}  
}
