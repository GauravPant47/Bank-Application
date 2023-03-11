package CustomerAccountDetails;

/*
 * There we will store a Customer Personal Details
 * 
 * His address his Document and some another details
 */
public class UserDetails {
	private String user_name;
	private String date_of_birth;
	private String user_father_name;
	private String father_date_of_birth;
	private String user_address;
	private String city;
	private String state;
	private String pincode;
	private String id_proof_number;
	/*
	 * 	getters and setters
	 */
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getUser_father_name() {
		return user_father_name;
	}
	public void setUser_father_name(String user_father_name) {
		this.user_father_name = user_father_name;
	}
	public String getFather_date_of_birth() {
		return father_date_of_birth;
	}
	public void setFather_date_of_birth(String father_date_of_birth) {
		this.father_date_of_birth = father_date_of_birth;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getId_proof_number() {
		return id_proof_number;
	}
	public void setId_proof_number(String id_proof_number) {
		this.id_proof_number = id_proof_number;
	}
}
