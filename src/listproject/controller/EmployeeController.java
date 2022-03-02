package listproject.controller;

import java.util.List;
import java.util.Scanner;

import listproject.bean.EmployeeBean;
import listproject.dao.EmployeeDao;
import listproject.service.EmployeeService;

public class EmployeeController {

	// instance
	EmployeeService employeeService;

	public void addEmployee() {

		employeeService = new EmployeeDao();

		EmployeeBean employeeBean = new EmployeeBean();

		employeeBean.seteId(101);
		employeeBean.seteName("samir");
		employeeBean.seteEmail("samir@gmail.com");
		employeeBean.seteAge(20);

		// 1010
		// addEmployee(101,"","",1);
		if (employeeService.addEmployee(employeeBean)) {

			System.out.println("EMployee Added...");
		}

	}

	public void viewEmployee() {

		List<EmployeeBean> employees = employeeService.viewEmployees();
		for (EmployeeBean emp : employees) {

			System.out.println("EmployeeId = " + emp.geteId());
			System.out.println("EmployeeName = " + emp.geteName());

		}
	}

	public void getEmpById() {

		employeeService = new EmployeeDao();
		EmployeeBean employeeBean = employeeService.getEmployeeByIndex(0);
		if (employeeBean != null) {
			System.out.println(employeeBean.geteId());
		} else {

			System.out.println("no employee found...");
		}
	}

	public static void main(String[] args) {

		EmployeeController employeeController = new EmployeeController();
		int choice = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("press 1 for add emp");
			System.out.println("press 2 for view emp");
			System.out.println("press 3 for view emp by index");
			System.out.println("press 4 for exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				employeeController.addEmployee();
				break;
			case 2:
				employeeController.viewEmployee();
				break;
			case 3:
				employeeController.getEmpById();
				break;

			default:
				break;
			}

		} while (choice != 4);

	}
}
