package algorithm.sorting;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

/** 
 * @author wxf 
 * @version 2015年3月2日 上午10:25:44 
 * 类说明 
 */
public class Shell extends Example{
	public static void sort(Comparable[] a) {
		// TODO Auto-generated method stub
		int N = a.length;
		int h = 1;
		while(h < N/3){
			h = h*3+1;
		}
		while ( h >= 1){
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && less(a[j], a[j-h]); j-=h) {
					exch(a, j-h, j);
				}
				
			}
			h = h/3;
		}
	}
	
	public static void main(String[] args) {
		Double[] a = new Double[30];
		for (int i = 0; i < a.length; i++) {
			a[i] = StdRandom.uniform();
		}
		sort(a);
	}
}
