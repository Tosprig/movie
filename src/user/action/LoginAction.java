package user.action;

import java.util.List;
import user.dao.UserDao;
import user.dao.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private String message = "error";//？？？
	private List<User> users;
	
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

	public String execute() throws Exception {
		   validateUser();
		   return message;
		
	}
	public void validateUser() {
		//System.out.print(this.getUsername());
		if (this.getUsername() == null || this.getUsername().length() == 0) {
		addFieldError("username", "用户名不能为空");//在username上边添加显示“用户名不能为空”
		} else {
		UserDao ud = new UserDao();
		List list = ud.queryInfo(this.getUsername());

		if (list.size() == 0) {
		    addFieldError("username", "该用户尚未注册");//在username上边添加显示“该用户尚未注册”
		} else {
		User u = new User();
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
		   count++;
		   u= (User) list.get(i);
		   if (this.getUsername().equals(u.getName())) {
		      if (u.getPassword().equals(this.getPassword())) {
		         message = "succlogin";
		      } 
		      else {
		       addFieldError("password", "密码错误");//在username上边添加显示“密码错误”
		      }
		   }
		 }
	   }
		
    }
  }
	public String list(){
		UserDao ud = new UserDao();
		this.users = ud.getUsers();
		return "list";
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
