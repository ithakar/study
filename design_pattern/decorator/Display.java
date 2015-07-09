/** 
 * @author wxf 
 * @version 2015年7月1日 下午4:46:40 
 * 类说明 
 */
public class Display {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("============decaf=============");
		Beverage decaf = new Milk(new Whip());
		System.out.println(decaf.cost());
		
	}
}
