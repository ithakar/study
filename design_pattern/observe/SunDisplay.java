/** 
 * @author wxf 
 * @version 2015年7月1日 下午3:33:02 
 * 类说明 
 */
public class SunDisplay implements Observe {

	@Override
	public void update(double temp, double sun, double wind) {
		// TODO Auto-generated method stub
		System.out.println("======sun display======");
		System.out.println("temp : " + temp + '\n'
				+"sun : " + sun + '\n'
				+"wind : " +  wind );
	}

}
