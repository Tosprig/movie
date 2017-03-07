package love.action;

import love.dao.LoveDao;

public class DeleteAction {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String execute(){
		System.out.println(getName());
		LoveDao dao=new LoveDao();
	    try {
			dao.delete(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "love";
	}
}
