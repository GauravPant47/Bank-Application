package registration;

import java.util.Scanner;
public class RegistrationForm {
	private String firstName;
	private String lastName;
	private String gender;

	private String gamilId;
	private Long mobileNumber;

	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGamilId() {
		return gamilId;
	}

	public void setGamilId(String gamilId) {
		this.gamilId = gamilId;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RegistrationForm() {
		Scanner sc = new Scanner(System.in);
		System.out.println("********************************");

		System.out.println("Enter user first name : ");
		String fName = sc.nextLine();
		setFirstName(fName);
		System.out.println("********************************");
		System.out.println("Enter user last name : ");
		String lName = sc.nextLine();
		setLastName(lName);
		System.out.println("********************************");
		System.out.println("Enter user gender : ");
		String gender = sc.nextLine();
		setGender(gender);
		System.out.println("********************************");
		System.out.println("Enter user gmail id : ");
		String gamilId = sc.nextLine();
		setGamilId(gamilId);
		System.out.println("********************************");
		System.out.println("Enter user mobile number : ");
		Long phoneNum = sc.nextLong();
		setMobileNumber(phoneNum);
		System.out.println("********************************");
		System.out.println("Enter user password : ");
		String password1 =sc.nextLine();
		setPassword(password1);
		System.out.println("********************************");
//		for (int i = 0; i <= password.length(); i++) {
//			if (password.charAt(i) == ' ') {
//				System.err.println("Please password fill without Space : ");
//			} else {
//				if (password.charAt(i) > 8 && password.charAt(i) < 15) {
//					System.err.println("Update your password Minimum 8 characters and maximum 15 characters.. ");
//					if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'
//							|| password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
//						setPassword(password);
//					} else {
//						System.err.println("You can add one Capital character and smaller  character...");
//					}
//				} else {
//					System.err.println(
//							"You update wrong password... \nfill Minimum 8 characters and maximum 15 characters.. ");
//				}
//			}
//		}
		
	}

}
