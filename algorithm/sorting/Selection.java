package algorithm.sorting;
/** 
 * @author wxf 
 * @version 2015年3月2日 上午10:05:46 
 * 类说明 
 */
public class Selection extends Example{
	public static void sort(Comparable[] a){
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			exch(a, min, i);
		}
	}
}
