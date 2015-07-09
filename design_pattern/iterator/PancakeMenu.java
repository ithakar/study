
import java.util.ArrayList;
import java.util.Iterator;

/** 
 * @author wxf 
 * @version 2015年7月2日 下午5:09:57 
 * 类说明 
 */
public class PancakeMenu implements MyIterator<MenuItem>{
	private ArrayList<MenuItem> menuItems;
	
	public PancakeMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem("Regular","eggs","2.9");
		addItem("BlueBerry","berry","3.1");
		addItem("Wafflys","flys","4.0");
		System.out.println("pancake num is : " + menuItems.size());
	}

	private void addItem(String name, String describe, String price) {
		MenuItem menuItem = new MenuItem(name, describe, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList<MenuItem> getMenuItems(){
		return menuItems;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return !menuItems.isEmpty();
	}

	@Override
	public MenuItem next() {
		// TODO Auto-generated method stub
		if (!hasNext()) {
			System.out.println("soldout!");
		}
		MenuItem item = menuItems.get(0);
		menuItems.remove(0);
		return item;
	}
}
