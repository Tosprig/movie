package comedy.dao;

/**
 * Comedy entity. @author MyEclipse Persistence Tools
 */

public class Comedy implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String hrf;

	// Constructors

	/** default constructor */
	public Comedy() {
	}

	/** minimal constructor */
	public Comedy(String name) {
		this.name = name;
	}

	/** full constructor */
	public Comedy(String name, String hrf) {
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