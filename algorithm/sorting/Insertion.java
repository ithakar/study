package algorithm.sorting;
/** 
 * @author wxf 
 * @version 2015年3月2日 上午10:21:06 
 * 类说明 
 */
public class Insertion extends Example{
	public static void sort(Comparable[] a) {
	// TODO Auto-generated method stub
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
//				if (less(a[j], a[j-1])) {
					exch(a, j, j-1);
//				}
			}
		}
	}
}
