/** 
 * @author wxf 
 * @version 2015年7月2日 下午5:21:22 
 * 类说明 
 */
public class Witress {
	
	void printMenu(){
		
	}
	
	void printBreakfast(){
		
		
	}
	
	static void printLuch(){
		PancakeMenu pancakeMenu = new PancakeMenu();
//		while(pancakeMenu.hasNext()){
//			System.out.println(pancakeMenu.next());
//		}
	}
	
	static void printDinner(){
		DineMumu dineMumu = new DineMumu();
		while (dineMumu.hasNext()) {
			System.out.println(dineMumu.next());
			
		}
	}
	
	public static void main(String[] args) {
//		printLuch();
		printDinner();
	}

}
