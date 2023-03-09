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
		rf.setFirstName(first_name+" ");
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
		System.out.println("Enter gender : \nIf male=(m)//female=(f)//other=(O)");
		String gender = sc.nextLine();
		gender = gender.toUpperCase();
		if(gender.equals("Y")) {
			rf.setGender(gender);
		}else if (gender.equals("F")) {
			rf.setGender(gender);
		}else if(gender.equals("O")){
			rf.setGender(gender);
		}
		
		/*
		 * ********
		 */
		System.out.println("*************************");
		System.out.println("Enter Email id : ");
		String gmail_Id = sc.nextLine();
		String emailId = email_Validation(gmail_Id);

		for (int i = 0; i <= emailId.length(); i++) {
			if (emailId == null) {
				break;	
			} else {
				rf.setGamilId(emailId);
			}
		}

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
		System.out.println("Enter User-Id : ");
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
		System.out.println("");
		String update = sc.nextLine();
		update=update.toLowerCase();

	}

	/*
	 * 
	 * There we are the Verify user Email Id
	 * 
	 */
	private String email_Validation(String gmail_Id) {
		int code1 = 0, code2 = 0;

		for (int i = 0; i <= gmail_Id.length() - 1; i++) {
			if (gmail_Id.contains(" ")) {
				System.err.println("Wrong way to fill do not give any Space : ");
				break;
			} else {
				if (gmail_Id.charAt(i) >= 48 && gmail_Id.charAt(i) <= 57) {
					code1++;
				}
				if (gmail_Id.charAt(i) == 46 || gmail_Id.charAt(i) == 64) {
					code2++;
				}
			}
		}
		/*
		 * in there i am Facing a problem the problem is
		 * 
		 * if we update Wrong eamil-id it can't break it Continue running
		 * 
		 * we need to add the this code in loop then we break our code
		 */

		if (code1 > 0 && code2 > 0) {
			System.out.println("Valid Email Id...");
			return gmail_Id;
		} else {
			System.err.println("Invalid Email Id...");
			return gmail_Id;

		}

	}

	/*
	 * There we are the Verify user mobile number
	 */
	private String number_Validation(String mobile_Number) {
		int code1 = 0, code2 = 0;
		if (mobile_Number.length() == 10) {
			for (int i = 0; i <= mobile_Number.length() - 1; i++) {
				if (mobile_Number.contains(" ")) {
					System.err.println("Update Wright Mobile number...");
					break;
				} else {
					if (mobile_Number.charAt(i) >= 0 && mobile_Number.charAt(i) <= 9) {
						code1++;
					} else {
						break;
					}
				}
			}
		} else {
			System.err.println("Update Wright Mobile number...");
//			break;
		}

		if (code1 > 0) {
			return "Valid Mobile Number...";
		} else {
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
					break;
				} else {
					if (paw.charAt(i) >= 'A' && paw.charAt(i) <= 'Z') {
						code1++;
					} else {
						break;
					}
					if (paw.charAt(i) >= 'a' && paw.charAt(i) <= 'z') {
						code2++;
					} else {
						break;
					}
					if (paw.charAt(i) >= 0 && paw.charAt(i) <= 9) {
						code3++;
					} else {
						break;
					}
					if (paw.charAt(i) >= 35 && paw.charAt(i) <= 46) {
						code4++;
					} else {
						break;
					}
				}
			}
		} else {
			System.err.println("Invalid Password... \nPlease Fill again...");
//			break;
		}
		if (code1 > 0 && code2 > 0 && code3 > 0 && code4 > 0) {
			System.out.println("Valid Password...");
			return "valid Password";
		} else {
			return "Invalid Password";
		}
	}

}
