package love.dao;

/**
 * Love entity. @author MyEclipse Persistence Tools
 */

public class Love implements java.io.Serializable {

	// Fields

	private String name;
	private String hrf;

	// Constructors

	/** default constructor */
	public Love() {
	}

	/** minimal constructor */
	public Love(String name) {
		this.name = name;
	}

	/** full constructor */
	public Love(String name, String hrf) {
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