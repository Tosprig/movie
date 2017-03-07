package user.action;

import user.dao.UserDao;
import user.dao.User;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private String username;
	private String password;
	private String email;
	private String phonenum;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String execute() throws Exception {
		
		User u = new User(getUsername(), getPassword(),getEmail(),getPhonenum());
		UserDao ua=new UserDao();
		//System.out.print(this.getUsername());
		ua.addUser(u);
		return "success";
	}

}
