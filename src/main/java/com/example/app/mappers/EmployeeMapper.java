package com.example.app.mappers;

import com.example.app.entities.Employee;
import com.example.app.dtos.EmployeeDto;

import static com.example.app.mappers.PassportMapper.mapToPassportDto;



public class EmployeeMapper {
	public static Employee mapToEmployee(EmployeeDto employeeDto)
	{
		return Employee.builder()
				.id(employeeDto.getId())
				.firstName(employeeDto.getFirstName())
				.lastName(employeeDto.getLastName())
				.gender(employeeDto.getGender())
				.age(employeeDto.getAge())
				.hiringDate(employeeDto.getHiringDate())
				.department(employeeDto.getDepartment())
				.salary(employeeDto.getSalary())
				.description(employeeDto.getDescription())
				.imgURL(employeeDto.getImgURL())
				.build();
	}
	
	public static EmployeeDto mapToEmployeeDto(Employee employee)
	{
		return EmployeeDto.builder()
				.id(employee.getId())
				.firstName(employee.getFirstName())
				.lastName(employee.getLastName())
				.gender(employee.getGender())
				.age(employee.getAge())
				.hiringDate(employee.getHiringDate())
				.department(employee.getDepartment())
				.salary(employee.getSalary())
				.description(employee.getDescription())
				.imgURL(employee.getImgURL())
				.passport(employee.getPassport() == null ? null : mapToPassportDto(employee.getPassport()))
				.build();
	}
	
	public static Employee updateEmployee(EmployeeDto employeeDto, Employee employee)
	{
		employee.setFirstName(employeeDto.getFirstName());
		employee.setLastName(employeeDto.getLastName());
		employee.setAge(employeeDto.getAge());
		employee.setHiringDate(employeeDto.getHiringDate());
		employee.setDepartment(employeeDto.getDepartment());
		employee.setSalary(employeeDto.getSalary());
		employee.setDescription(employeeDto.getDescription());
		employee.setImgURL(employeeDto.getImgURL());
		
		return employee;
	}
}
