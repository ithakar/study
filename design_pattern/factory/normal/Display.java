/** 
 * @author wxf 
 * @version 2015年7月1日 下午5:13:46 
 * 类说明 
 */
public class Display {
	
	
	public static void main(String[] args) {
		Factory carFactory = new BMWfactory();
		Car car = carFactory.getInstance();
		car.drive();
	}
	
}
