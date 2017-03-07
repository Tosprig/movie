package animation.action;

import animation.dao.AnimationDao;

public class DeleteAction {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String execute(){
		AnimationDao dao=new AnimationDao();
	    dao.delete(name);

		return "animation";
	}
}
