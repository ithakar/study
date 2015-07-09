/** 
 * @author wxf 
 * @version 2015年7月1日 下午5:50:25 
 * 类说明 
 */
public class Diaplay {
	
	
	public static void main(String[] args) {
		Factory factory = new RedFactory();
		
		Car BMW = factory.getBMW();
		
		BMW.drive();
	}
}
