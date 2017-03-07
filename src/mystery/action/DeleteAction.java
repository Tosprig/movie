package mystery.action;

import mystery.dao.MysteryDao;

public class DeleteAction {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String execute(){
		MysteryDao dao=new MysteryDao();
	    dao.delete(name);

		return "mystery";
	}
}
