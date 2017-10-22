package com.owen.services;

import com.owen.Storm_Models.Employee;

public class EmployeeClientService
{
	public Employee getEmployee()
	{
		return new Employee("Owen Lee", 24, true);
	}
}
