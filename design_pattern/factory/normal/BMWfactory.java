/** 
 * @author wxf 
 * @version 2015年7月1日 下午5:11:12 
 * 类说明 
 */
public class BMWfactory implements Factory {

	@Override
	public Car getInstance() {
		// TODO Auto-generated method stub
		return new BMW();
	}

}
