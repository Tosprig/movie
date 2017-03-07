package animation.action;

import java.io.File;
import java.io.IOException;

import animation.dao.Animation;
import animation.dao.AnimationDao;

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
		
		Animation loe = new Animation(getName(),getHrf());
		AnimationDao dao = new AnimationDao();
		dao.add(loe);
		
		
		
		String path=ServletActionContext.getServletContext().getRealPath("/images/Animation");
		File savefile=new File(path,getName()+".jpg");
		try {
			FileUtils.copyFile(image, savefile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "animation";
	}
}
