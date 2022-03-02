package listproject.service;

import java.util.List;

import listproject.bean.EmployeeBean;

public interface EmployeeService {

	boolean addEmployee(EmployeeBean employeeBean);

	List<EmployeeBean> viewEmployees();
	
	EmployeeBean getEmployeeByIndex(int index);

}
