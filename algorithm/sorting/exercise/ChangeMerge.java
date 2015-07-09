package algorithm.sorting.exercise;

import algorithm.sorting.Example;

/** 
 * @author wxf 
 * @version 2015年3月2日 下午3:03:02 
 * 类说明 
 */
public class ChangeMerge extends Example{
	
	private static Comparable[] aux;
	
	public static void sort(Comparable[] a) {
		// TODO Auto-generated method stub
		aux = new Comparable[a.length];
		sort(a, 0, a.length-1);
	}
	
	private static void sort(Comparable[] a, int low, int high) {
		// TODO Auto-generated method stub
		if (high <= low) {
			return;
		}
		int mid = low + (high - low)/2;
		if (mid <= 15) {
//			InsertionX.sort(a);
			insertion(a,low,high);
			return;
		}
		sort(a, low, mid);
		sort(a, mid+1, high);
		merge(a, low, mid, high);
	}
	
	private static void insertion(Comparable[] a, int low, int high) {
		// TODO Auto-generated method stub
		for (int i = low; i <= high; i++) {
			for (int j = i; j > 0 && less(a[j], a[i]); j--) {
				exch(a, i, j);
			}
		}
	}

	public static void merge(Comparable[] a,int low, int mid, int high){
		
		if (a[mid+1].compareTo(a[mid]) > 0) {
			return;
		}
		
		int i = low;
		int j = mid+1;
		
//		if (isSorted(a)) {
//			return;
//		}
		
		for (int k = low; k <= high; k++) {
			aux[k] = a[k];
		}
		
		for (int k = low; k <= high; k++) {
			if (i > mid ) {
				a[k] = aux[j++];
			} else if (j > high) {
				a[k] = aux[i++];
			} else if (less(aux[j], aux[i])) {
				a[k] = aux[j++];
			} else {
				a[k] = aux[i++];
			}
		}
	}
}
