package animation.dao;

/**
 * Animation entity. @author MyEclipse Persistence Tools
 */

public class Animation implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String hrf;

	// Constructors

	/** default constructor */
	public Animation() {
	}

	/** minimal constructor */
	public Animation(String name) {
		this.name = name;
	}

	/** full constructor */
	public Animation(String name, String hrf) {
		this.name = name;
		this.hrf = hrf;
	}

	// Property accessors

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHrf() {
		return this.hrf;
	}

	public void setHrf(String hrf) {
		this.hrf = hrf;
	}

}