package com.dss.spring.jdbc.main;

import java.util.List;

import java.util.Random;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dss.spring.jdbc.dao.EmployeeDAO;
import com.dss.spring.jdbc.model.Employee;

public class SpringMain {

	public static void main(String[] args) {
		// Get the Spring Context
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		// Get the EmployeeDAO Bean
		// EmployeeDAO employeeDAO = ctx.getBean("employeeDAO",
		// EmployeeDAO.class);
		// To use JdbcTemplate
		EmployeeDAO employeeDAO = ctx.getBean("employeeDAOJDBCTemplate", EmployeeDAO.class);

		// Run some tests for JDBC CRUD operations
		Employee emp = new Employee();
		//to get unique  id for the records..
		int rand = new Random().nextInt(1000);
		emp.setId(rand);
		emp.setName("Bikram");
		emp.setRole("Developer");

		// Create
		employeeDAO.save(emp);
		/*
		 * //Read Employee emp1 = employeeDAO.getById(rand); System.out.println(
		 * "Employee Retrieved::"+emp1);
		 * 
		 * //Update emp.setRole("CEO"); employeeDAO.update(emp);
		 * 
		 * //Get All List<Employee> empList = employeeDAO.getAll();
		 * System.out.println(empList);
		 * 
		 * //Delete employeeDAO.deleteById(rand);
		 * 
		 * //Close Spring Context ctx.close();
		 */
		System.out.println("DONE");
	}

}
