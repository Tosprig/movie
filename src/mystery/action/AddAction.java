package mystery.action;

import java.io.File;
import java.io.IOException;

import mystery.dao.Mystery;
import mystery.dao.MysteryDao;
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
		
		Mystery loe = new Mystery(getName(),getHrf());
		MysteryDao dao = new MysteryDao();
		dao.add(loe);
		
		
		
		String path=ServletActionContext.getServletContext().getRealPath("/images/Mystery");
		File savefile=new File(path,getName()+".jpg");
		try {
			FileUtils.copyFile(image, savefile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "mystery";
	}
}
