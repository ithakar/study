package algorithm.sorting;

import edu.princeton.cs.introcs.StdOut;

/** 
 * @author wxf 
 * @version 2015年3月2日 上午10:06:08 
 * 类说明 
 */
public class Example {
	public static void sort(Comparable[] a){
		
	}
	
	public static boolean less(Comparable v,Comparable w){
		return v.compareTo(w)<0;
	}
	
	public static void exch(Comparable[] a, int i,int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void show(Comparable[] a){
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i] + " ");
		}
		StdOut.println();
	}
	
	public static boolean isSorted(Comparable[] a){
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i-1])) {
				return false;
			}
		}
		return true;
	}
}
