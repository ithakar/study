/** 
 * @author wxf 
 * @version 2015年7月2日 上午11:12:52 
 * 类说明 
 */
public class Client {
	
	public static void main(String[] args) {
		Lift lift = new Lift();
		
		lift.run();
		lift.open();
		lift.stop();
		lift.stop();
		lift.open();
		lift.run();
		lift.close();
	}
	
}
