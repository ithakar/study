package algorithm.sorting.exercise;

import java.util.Random;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import algorithm.sorting.Example;
import algorithm.sorting.Quick;

/** 
 * @author wxf 
 * @version 2015年3月4日 下午12:01:23 
 * 类说明 
 */
public class Nuts extends Example{
	public static void main(String[] args) {
		int N = StdIn.readInt();
		Integer[] a = new Integer[N];
		Random random = new Random();
		for (int i = 0; i < a.length; i+=2) {
			a[i] = random.nextInt(N);
			a[i+1] = a[i];
//			StdOut.print(a[i]+" " + a[i+1]+" ");
		}
		
		Card.random(a);
		
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i]+" ");
		}
		
		int mid = N/2;
		StdOut.print("\n ");
		Quick.sort(a);
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i]+" ");
		}
	}
}
