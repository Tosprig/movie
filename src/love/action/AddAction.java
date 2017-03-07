package love.action;

import java.io.File;
import java.io.IOException;

import love.dao.Love;
import love.dao.LoveDao;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;


public class AddAction {
	private String name;
	private String hrf;
	private File image;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHrf() {
		return hrf;
	}
	public void setHrf(String hrf) {
		this.hrf = hrf;
	}
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
	
	public String execute(){
		Love loe = new Love(getName(),getHrf());
		LoveDao dao = new LoveDao();
		try {
			dao.add(loe);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		String path=ServletActionContext.getServletContext().getRealPath("/images/Love");
		File savefile=new File(path,getName()+".jpg");
		try {
			FileUtils.copyFile(image, savefile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "love";
	}
}
