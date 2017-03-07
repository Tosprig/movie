package comedy.action;

import comedy.dao.ComedyDao;

public class DeleteAction {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String execute(){
		ComedyDao dao=new ComedyDao();
	    dao.delete(name);

		return "comedy";
	}
}
