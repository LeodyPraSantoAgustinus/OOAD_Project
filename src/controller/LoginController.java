package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Employee;
import view.Login;

public class LoginController extends Controller {

	protected Login login;
	
	public LoginController() {
		login = new Login();
		login.btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String username = login.textUsername.getText();
				String password = login.textPassword.getText();
				authLogin(username, password);
				
			}
		});
		
	}
	
	private void authLogin(String username, String password) {
		Employee emp = Employee.authLogin(username, password);
		if(emp != null && emp.getUsername().equals(username) && emp.getPassword().equals(password)) {
			loginUser(emp);
		}
		else {
			System.out.println("emp not found");
		}
		
	}
	
	private void loginUser(Employee emp) {
		String EmpRole = emp.getRoleId();
		if(EmpRole.equals("CAS")) {
			System.out.println("cas");
		}
		else if(EmpRole.equals("MAN")) {
			System.out.println("man");
		}
		else if(EmpRole.equals("PRO")){
			new ProductManagementController();
		}
		else if(EmpRole.equals("HRD")) {
			System.out.println("hrd");
		}
		this.login.dispose();
	}
	
}
