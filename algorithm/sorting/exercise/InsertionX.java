package algorithm.sorting.exercise;

import algorithm.sorting.Example;

/** 
 * @author wxf 
 * @version 2015年3月9日 下午4:57:35 
 * 类说明 
 */
public class InsertionX extends Example{
	public static void change(Comparable[] a,int n){
		Comparable min = a[0];
		if (min.compareTo(a[n]) > 0) {
			exch(a, 0, n);
		}
//		return min;
	}
	
	public static void sort(Comparable[] a) {
		// TODO Auto-generated method stub
			for (int i = 1; i < a.length; i++) {
				change(a, i);
				for (int j = i; less(a[j], a[j-1]); j--) {
//					if (less(a[j], a[j-1])) {
						exch(a, j, j-1);
//					}
				}
			}
		}
}
