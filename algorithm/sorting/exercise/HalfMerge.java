package algorithm.sorting.exercise;

import algorithm.sorting.Example;

/** 
 * @author wxf 
 * @version 2015年3月3日 下午2:06:53 
 * 类说明 
 */
public class HalfMerge extends Example{
	
	private static Comparable[] aux;
	
	public static void sort(Comparable[] a){
		aux = new Comparable[a.length];
		sort(a,0,a.length-1);
	}

	private static void sort(Comparable[] a, int low, int high) {
		// TODO Auto-generated method stub
		if (high <= low) {
			return;
		}
		int mid = low + (high - low)/2;
		sort(a, low, mid);
		sort(a, mid+1, high);
		merge(a, low, mid, high);
	}

	private static void merge(Comparable[] a, int low, int mid, int high) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			aux[i] = a[i];
		}
	}
}
