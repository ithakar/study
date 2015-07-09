/** 
 * @author wxf 
 * @version 2015年7月1日 下午3:17:20 
 * 类说明 
 */
public class Display {
	
	
	public static void main(String[] args) {
		Weather weather = new Weather();
		
		Observe temple = new TempleDisplay();
		weather.registerObserve(temple);
		
		Observe sun = new SunDisplay();
		weather.registerObserve(sun);
		
		weather.set(121, 12, 32);
	}

}
