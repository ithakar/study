/** 
 * @author wxf 
 * @version 2015年7月1日 上午11:43:44 
 * 类说明 
 */
public class TempleDisplay implements Observe{
	
	public TempleDisplay() {
		// TODO Auto-generated constructor stub
	}

	public void show(double temp, double sun, double wind) {
		// TODO Auto-generated method stub
		System.out.println("temp : " + temp + '\n'
				+"sun : " + sun + '\n'
				+"wind : " +  wind );
	}

	@Override
	public void update(double temp, double sun, double wind) {
		// TODO Auto-generated method stub
		System.out.println("======temp display======");
		System.out.println("temp : " + temp + '\n'
				+"sun : " + sun + '\n'
				+"wind : " +  wind );
	}
}
