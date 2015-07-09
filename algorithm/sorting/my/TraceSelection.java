package algorithm.sorting.my;

import algorithm.sorting.Insertion;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdDraw;

/** 
 * @author wxf 
 * @version 2015年3月12日 下午3:38:23 
 * 类说明 
 */
public class TraceSelection {
	
	public static void main(String[] args) {
		
		String[] s = In.readStrings();
		Insertion.sort(s);
		
	}		
	
	private static void draw(String a, int row, int key, int min){
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(-2.50, row, key+"");
	}
}
