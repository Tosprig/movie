package user.action;

import java.util.List;
import user.dao.UserDao;
import user.dao.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private String message = "error";//������
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
		addFieldError("username", "�û�������Ϊ��");//��username�ϱ������ʾ���û�������Ϊ�ա�
		} else {
		UserDao ud = new UserDao();
		List list = ud.queryInfo(this.getUsername());

		if (list.size() == 0) {
		    addFieldError("username", "���û���δע��");//��username�ϱ������ʾ�����û���δע�ᡱ
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
		       addFieldError("password", "�������");//��username�ϱ������ʾ���������
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
