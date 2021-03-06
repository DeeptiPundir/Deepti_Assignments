package com.springrest.restassignment5.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springrest.restassignment5.entities.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	//search all employees
	
	public List<Employee> findAll()
	{
		return jdbcTemplate.query
				("select * from employee",
				new BeanPropertyRowMapper<Employee>(Employee.class));
	}
	
	
	public int insert(Employee employee)
	{
		return jdbcTemplate.update
				("INSERT INTO EMPLOYEE (EMPID , EMPNAME, EMPDEPARTMENT , "
						+ "EMPDESIGNATION, EMPSALARY)" +
						"VALUES(?,?,?,?,?)",
				new Object[] {employee.getEmpId(),employee.getEmpName(),
						employee.getEmpDepartment(),employee.getEmpDesignation(),
						employee.getEmpSalary()});
	}
	
	
	
	@SuppressWarnings("deprecation")
	public Employee findById(int id)
	{
		return (Employee) jdbcTemplate.queryForObject
				("select * from employee where empId=?",
						new Object[] {id},
				new BeanPropertyRowMapper<Employee>(Employee.class));
	}
	
	public int deleteById(int id)
	{
		return jdbcTemplate.update
				("delete from employee where empId=?", new Object[] {id});
	}


}
