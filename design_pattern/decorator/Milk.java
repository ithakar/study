/** 
 * @author wxf 
 * @version 2015年7月1日 下午4:42:29 
 * 类说明 
 */
public class Milk extends Beverage{

	private double price = 4;
	
	public Milk(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.setPrice(this.getPrice() + beverage.cost());
	}

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
