
import java.util.ArrayList;

import design.iterator.MenuItem;

/** 
 * @author wxf 
 * @version 2015年7月2日 下午6:05:30 
 * 类说明 
 */
public abstract class Menu {
	
	private ArrayList<Menu> childItems;
	
	private ArrayList<MenuItem> menuItems;
	
	private String name;
	private String describe;
	private String price;

	public Menu(String name, String describe, String price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.describe = describe;
		this.price = price;
	}
	
	private void addItem(String name, String describe, String price) {
		MenuItem menuItem = new MenuItem(name, describe, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList<MenuItem> getMenuItems(){
		return menuItems;
	}
	
	public abstract void add(Menu menu);
	
	public abstract void remove(Menu menu);
	
	public abstract void eachChild(Menu menu);
	
	
}
