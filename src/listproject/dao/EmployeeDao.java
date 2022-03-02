package listproject.dao;

import java.util.ArrayList;
import java.util.List;

import listproject.bean.EmployeeBean;
import listproject.service.EmployeeService;

public class EmployeeDao implements EmployeeService {

	static List<EmployeeBean> employees = new ArrayList<EmployeeBean>();

	@Override
	public boolean addEmployee(EmployeeBean employeeBean) {
		employees.add(employeeBean);
		return true;
	}

	@Override
	public List<EmployeeBean> viewEmployees() {

		return employees;
	}

	@Override
	public EmployeeBean getEmployeeByIndex(int index) {

		// EmployeeBean employeeBean = new EmployeeBean();
		// employeeBean = employees.get(index);
		if (employees.size() != 0) {
			return employees.get(index);
		}
		return null;
	}

}
