
import java.awt.event.ItemEvent;

/** 
 * @author wxf 
 * @version 2015年7月2日 下午5:17:10 
 * 类说明 
 */
public class DineMumu implements MyIterator<MenuItem>{
	
	private MenuItem[] menuItems;
	int num = 0;
	
	public DineMumu() {
		menuItems = new MenuItem[100];
		addItem("Regular","eggs","2.9");
		addItem("BlueBerry","berry","3.1");
		addItem("Wafflys","flys","4.0");
	}
	
	private void addItem(String name, String describe, String price) {
		MenuItem menuItem = new MenuItem(name, describe, price);
		if (num < menuItems.length) {
			menuItems[num++] = menuItem;
		}
	}
	
	public MenuItem[] getMenuItems(){
		return menuItems;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return !(num == 0);
	}

	@Override
	public MenuItem next() {
		// TODO Auto-generated method stub
		MenuItem item = null;
		if (hasNext()) {
			item = menuItems[num-1];
			num = num-1;
		}
		return item;
	}

}
