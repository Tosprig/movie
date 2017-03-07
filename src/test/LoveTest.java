package test;
import love.dao.Love;
import love.dao.LoveDao;
public class LoveTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Love lo = new Love();
		lo.setName("lovee");
		lo.setHrf("1234");
		LoveDao da= new LoveDao();
		da.add(lo);
	}

}
