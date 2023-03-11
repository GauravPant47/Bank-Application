package registration;

import java.util.Scanner;

import CustomerAccountDetails.UserDetails;

public class DatabaseConnection {
	public DatabaseConnection() {

		/*
		 * Adding data in RegistrationFrom.java
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * creating a RegistrationForm and LoginId object
		 */
		RegistrationForm rf = new RegistrationForm();
		LoginId sin = new LoginId();
		/*
		 * updating data in RegistrationForm
		 */
		System.out.println("*************************");
		System.out.println("Enter user first name : ");
		String first_name = sc.nextLine();
		rf.setFirstName(first_name + " ");
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
		if (gender.equals("M")) {
			rf.setGender(gender);
		} else if (gender.equals("F")) {
			rf.setGender(gender);
		} else if (gender.equals("O")) {
			rf.setGender(gender);
		}

		/*
		 * ********
		 */
		System.out.println("*************************");
		System.out.println("Enter Email id : ");
		String gmail_Id = sc.nextLine();
		String emailId = email_Validation(gmail_Id);
		rf.setGamilId(emailId);
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
		System.out.println("Enter password : "
				+ "\nEnter 8 to 15 characters\n1 uppercase\n1 lowercase\n1 number\n1 special character(#,$,%,&)");
		String paw = sc.nextLine();
		String pass1 = password_Validation(paw);
		rf.setPassword(pass1);

		/*
		 * ********
		 */
		System.out.println("*************************");

		System.out.println("**Enter**");
		sc.nextLine();

		System.out.println("Name : " + rf.getFirstName() + rf.getLastName());

		System.out.println("Gemder : " + rf.getGender());

		System.out.println("Email Id : " + rf.getGamilId());

		System.out.println("Mobile.No : " + rf.getMobileNumber());

		System.out.println("User Id : " + rf.getuserId());

		System.out.println("User Password : " + rf.getPassword());
		sc.nextLine();
		System.out.println("**Enter**");

		System.out.println("Data will be stor... ");
		System.out.println("Do You want to Login your Acount : (Y/N)");

		String update = sc.nextLine();
		update = update.toLowerCase();

		if (update.equals("y")) {
			System.out.println("Enter UserId : ");
			String userId1 = sc.nextLine();
			sin.setUserName(userId1);

			System.out.println("*************************");

			System.out.println("Enter tha user password : ");
			String paw1 = sc.nextLine();
			String pass2 = verification2(paw1);
			sin.setPassword2(pass2);
			System.out.println("*************************");
		} else {
			System.err.println("Updating there a bank policy...");
		}
		if (rf.getuserId().equals(sin.getUserName()) && rf.getPassword().equals(sin.getPassword2())) {
			System.out.println("Welcome Our bank WebSide");
			/*
			 * Transfer to user details class 
			 */
			UserDetails ud = new UserDetails();
		} else {
			System.err.println("Invalid Password");
		}
	}

	/*
	 * 
	 * here we are verify the login time our password password are ok are not
	 * 
	 */
	private String verification2(String paw1) {
		int code1 = 0, code2 = 0, code3 = 0, code4 = 0;

		if (paw1.length() >= 8 && paw1.length() <= 15) {
			for (int i = 0; i <= paw1.length() - 1; i++) {
				if (paw1.contains(" ")) {
					System.out.println("Wrong way to fill do not give any Space : ");
				} else {
					if (paw1.charAt(i) >= 'A' && paw1.charAt(i) <= 'Z') {
						code1++;
					}
					if (paw1.charAt(i) >= 'a' && paw1.charAt(i) <= 'z') {
						code2++;
					}
					if (paw1.charAt(i) >= '0' && paw1.charAt(i) <= '9') {
						code3++;
					}
					if (paw1.charAt(i) >= 35 && paw1.charAt(i) <= 38) {
						code4++;
					}
				}
			}
		} else {
			System.out.println("Invalid password... ");
		}
		if (code1 > 0 && code2 > 0 && code3 > 0 && code4 > 0) {
			return paw1;
		} else {
			System.err.println("Invalid Password...");
			return paw1;
		}
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
		if (mobile_Number.length() >= 10 && mobile_Number.length() <= 15) {
			for (int i = 0; i <= mobile_Number.length() - 1; i++) {
				if (mobile_Number.contains(" ")) {
					System.err.println("Update Wright Mobile number...");
					break;
				} else {
					if (mobile_Number.charAt(i) >= '0' && mobile_Number.charAt(i) <= '9') {
						code1++;
					}
				}
			}
		} else {
			System.err.println("Update Wright Mobile number...");
//			break;
		}

		if (code1 > 0) {
			return mobile_Number;
		} else {
			System.err.println("Invalid Mobile Number...");
			return mobile_Number;
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
					}
					if (paw.charAt(i) >= 'a' && paw.charAt(i) <= 'z') {
						code2++;
					}
					if (paw.charAt(i) >= '0' && paw.charAt(i) <= '9') {
						code3++;
					}
					if (paw.charAt(i) >= 35 && paw.charAt(i) <= 38) {
						code4++;
					}
				}
			}
		} else {
			System.err.println("Invalid Password... \nPlease Fill again...");
//			break;
		}
		if (code1 > 0 && code2 > 0 && code3 > 0 && code4 > 0) {
			return paw;
		} else {
			System.err.println("Invalid Password...");
			return paw;
		}
	}

}
