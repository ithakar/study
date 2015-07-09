
import design.factory.normal.BMW;
import design.factory.normal.Fort;

/** 
 * @author wxf 
 * @version 2015年7月1日 下午5:54:57 
 * 类说明 
 */
public class RedFactory implements Factory {

	@Override
	public Car getBMW() {
		// TODO Auto-generated method stub
		return (Car) new BMW();
	}

	@Override
	public Car getFort() {
		// TODO Auto-generated method stub
		return (Car) new Fort();
	}

}
