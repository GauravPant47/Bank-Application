package registration;

import java.util.Scanner;

public class DatabaseConnection {

	public DatabaseConnection() {

		/*
		 * Adding data in RegistrationFrom.java
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * creating a RegistrationForm object
		 */
		RegistrationForm rf = new RegistrationForm();
		/*
		 * updating data in RegistrationForm
		 */
		System.out.println("*************************");
		System.out.println("Enter user first name : ");
		String first_name = sc.nextLine();
		rf.setFirstName(first_name);
		/*
		 * ********
		 */
		System.out.println("*************************");
		System.out.println("Enter user last name : ");
		String last_name = sc.nextLine();
		rf.setLastName(last_name);
		/*
		 * ********
		 */
		System.out.println("*************************");
		System.out.println("Enter gender : ");
		String gender = sc.nextLine();
		rf.setGender(gender);
		/*
		 * ********
		 */
		System.out.println("*************************");
		System.out.println("Enter gmail id : ");
		String gmail_Id = sc.nextLine();
		rf.setGamilId(gmail_Id);
		/*
		 * ********
		 */
		System.out.println("*************************");
		System.out.println("Enter Mobile Number : ");
		String mobile_Number = sc.nextLine();
		String mobile_Verify = number_Validation(mobile_Number);
		rf.setMobileNumber(mobile_Verify);
		/*
		 * ********
		 */
		System.out.println("*************************");
		System.out.println("Enter Mobile Number : ");
		String user_Id = sc.nextLine();
		rf.setuserId(user_Id);
		/*
		 * ********
		 */
		System.out.println("*************************");
		System.out.println("Enter password : ");
		String paw = sc.nextLine();
		String pass1 = password_Validation(paw);
		/*
		 * ********
		 */
		System.out.println("*************************");

	}
	/*
	 * There we are the Verify user mobile number 
	 */
	private String number_Validation(String mobile_Number) {
		int code1 = 0, code2 = 0;
		if(mobile_Number.length()>=0&&mobile_Number.length()<=9) {
			for(int i=0;i<=mobile_Number.length()-1;i++) {
				if(mobile_Number.contains(" ")) {
					System.err.println("Update Wright Mobile number...");
				}else {
					if (mobile_Number.charAt(i) >= 0 && mobile_Number.charAt(i) <= 9) {
						code1++;
					}
				}
			}
		}else {
			System.err.println("Update Wright Mobile number...");
		}
		
		if(code1>0) {
			return "Valid Mobile Number...";
		}else {
			return "Invalid Mobile Number...";
		}
		
	}

	/*
	 * There we are the Verify user given password
	 */
	private String password_Validation(String paw) {
		int code1 = 0, code2 = 0, code3 = 0, code4 = 0;

		if (paw.length() >= 8 && paw.length() <= 15) {
			for (int i = 0; i <= paw.length() - 1; i++) {
				if (paw.contains(" ")) {
					System.err.println("Wrong way to fill do not give any Space : ");
				} else {
					if (paw.charAt(i) >= 'A' && paw.charAt(i) <= 'Z') {
						code1++;
					}
					if (paw.charAt(i) >= 'a' && paw.charAt(i) <= 'z') {
						code2++;
					}
					if (paw.charAt(i) >= 0 && paw.charAt(i) <= 9) {
						code3++;
					}
					if (paw.charAt(i) >= 35 && paw.charAt(i) <= 46) {
						code4++;
					}
				}
			}
		} else {
			System.err.println("Invalid Password... \nPlease Fill again...");
		}
		if (code1 > 0 && code2 > 0 && code3 > 0 && code4 > 0) {
			System.out.println("Valid Password...");
			return "valid Password";
		} else {
			return "Invalid Password";
		}
	}

}
