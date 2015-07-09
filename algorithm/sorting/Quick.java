package algorithm.sorting;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;


/** 
 * @author wxf 
 * @version 2015年3月3日 上午10:26:00 
 * 快速排序 
 */
public class Quick extends Example{
	public static void sort(Comparable[] a){
		sort(a,0,a.length-1);
	}

	private static void sort(Comparable[] a, int low, int high) {
		// TODO Auto-generated method stub
		if (high <= low) {
			return;
		}
		int mid = position(a, low, high);
		sort(a,low,mid-1);
		sort(a,mid+1,high);
	}

	private static int position(Comparable[] a, int low, int high) {
		// TODO Auto-generated method stub
		Comparable min = a[low];
		int i = low;
		int j = high+1;
		
		while(true){
			while(less(a[++i], min)){
				if (i == high) {
					break;
				}
			}
			
			while (less(min, a[--j])){
				if (low == j) {
					break;
				}
			}
			if (i >= j) {
				break;
			}
			exch(a, i, j);
		}
		
		exch(a, j, low);
		
		return j;
	}
	
	public static void main(String[] args) {
		Integer[] a = new Integer[20];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (StdRandom.uniform()*100);
			StdOut.print(a[i] + " ");
		}
		StdOut.println();
		
		sort(a);
		
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i] + " ");
		}
		
	}
}
