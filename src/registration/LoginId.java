package registration;

import java.util.Scanner;

public class LoginId extends RegistrationForm{
	private String userName;
	private String password2;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public LoginId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("********************************");

		System.out.println("Enter user user name : ");
		String username = sc.nextLine();
		setUserName(username);
		System.out.println("********************************");
		System.out.println("Enter user password : ");
		String password3 = sc.nextLine();
		setPassword2(password3);
		System.out.println("********************************");
	}
	
	
}











