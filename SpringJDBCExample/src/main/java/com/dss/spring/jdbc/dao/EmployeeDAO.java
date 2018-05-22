package com.dss.spring.jdbc.dao;

import java.util.List;

import com.dss.spring.jdbc.model.Employee;

/**
 * This class is providing the functionality to perform the various operaions
 * like..saveDetails,editDetails,deleteDetails etc
 */
public interface EmployeeDAO {

	/**
	 * This method will be savig the records of employee. Those will be passed
	 * in the form of employee.
	 * 
	 * @param employee
	 */
	public void save(Employee employee);

	/**
	 * This method will helps us to get theindiviidual records by usiing
	 * Id(employee id).
	 * 
	 * @param id
	 * @return emplyee details..
	 */
	public Employee getById(int id);

	/**
	 * This method will help to perform update operatins it takes new records
	 * and erase the old records from db.
	 * 
	 * @param employee
	 */
	public void update(Employee employee);

	/**
	 * This method will help us to delete the records by using individual id.
	 * 
	 * @param id
	 */
	public void deleteById(int id);

	/**
	 * This method will helps to get the lost of employee..
	 * @return listOfEmployee
	 */
	public List<Employee> getAll();
}
