

/** 
 * @author wxf 
 * @version 2015年7月1日 下午5:26:04 
 * 类说明 
 */
public class SimpleCarFactory implements CarFactory {

	@Override
	public Car getInstace(String string) {
		// TODO Auto-generated method stub
		if (string.equals("BMW")) {
			return new BMW();
		}
		return null;
	}

}
