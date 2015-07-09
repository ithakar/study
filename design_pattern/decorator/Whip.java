/** 
 * @author wxf 
 * @version 2015年7月1日 下午4:43:07 
 * 类说明 
 */
public class Whip extends Beverage{
	
	private double price = 3.9;

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return getPrice();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
