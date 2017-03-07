package comedy.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import comedy.dao.Comedy;
import comedy.dao.ComedyDao;


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
		
		Comedy loe = new Comedy(getName(),getHrf());
		ComedyDao dao = new ComedyDao();
		dao.add(loe);
		
		
		
		String path=ServletActionContext.getServletContext().getRealPath("/images/Comedy");
		File savefile=new File(path,getName()+".jpg");
		try {
			FileUtils.copyFile(image, savefile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "comedy";
	}
}
