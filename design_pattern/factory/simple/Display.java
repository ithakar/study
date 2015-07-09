/** 
 * @author wxf 
 * @version 2015年7月1日 下午5:23:42 
 * 类说明 
 */
public class Display {

	public static void main(String[] args) {
		CarFactory factory = new SimpleCarFactory();
		Car car = factory.getInstace("BMW");
		car.drive();
	}
}
