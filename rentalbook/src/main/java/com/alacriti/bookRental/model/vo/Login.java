package com.alacriti.bookRental.model.vo;

//import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Login {

	
	 
		 private int user_id;
		private String user_name,password,user_type,email_id,mobile_number;
		
		public int getUser_id() {
			return user_id;
		}
		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUser_type() {
			return user_type;
		}
		public void setUser_type(String user_type) {
			this.user_type = user_type;
		}
		public String getEmail_id() {
			return email_id;
		}
		public void setEmail_id(String email_id) {
			this.email_id = email_id;
		}
		public String getMobile_number() {
			return mobile_number;
		}
		public void setMobile_number(String mobile_number) {
			this.mobile_number = mobile_number;
		}
		public Login(int user_id, String user_name, String password,
				String user_type, String email_id, String mobile_number) {
			super();
			this.user_id = user_id;
			this.user_name = user_name;
			this.password = password;
			this.user_type = user_type;
			this.email_id = email_id;
			this.mobile_number = mobile_number;
		}
		public Login() {
			// TODO Auto-generated constructor stub
		}
	
		
		 
		
		
		 

}
