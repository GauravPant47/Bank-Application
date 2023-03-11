package WebPage;

import java.util.Scanner;

import registration.DatabaseConnection;
import registration.LoginId;

public class MainWebPage {
	public static void main(String[] args) {
		System.out.println("********Wellcome All Bank System********\n");
		System.out.println("Do You Want to Open Account: Y and N");

		Scanner sc = new Scanner(System.in);
		String update = sc.nextLine();
		update = update.toLowerCase();
		if(update.equals("y")) {
			DatabaseConnection dc = new DatabaseConnection();
		}
		if(update.equals("n")) {
			LoginId lid= new LoginId();
		}
		

	}
}
