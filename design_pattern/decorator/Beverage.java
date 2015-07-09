/** 
 * @author wxf 
 * @version 2015年7月1日 下午4:22:17 
 * 类说明 
 */
public abstract class Beverage {
	
	private String description;
	
	
	public Object getDescription(){
		return description;
	}
	
	public abstract double cost();
}
