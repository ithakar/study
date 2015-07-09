package algorithm.sorting;

import algorithm.sorting.exercise.InsertionX;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

/** 
 * @author wxf 
 * @version 2015年3月3日 上午11:01:29 
 * 类说明 
 */
public class TestAlgorithm {
	public static void main(String[] args) {
		Integer[] a = new Integer[20];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (StdRandom.uniform()*100);
			StdOut.print(a[i] + " ");
		}
		StdOut.println();
		
//		Quick.sort(a);    //快速排序
		Merge.sort(a);
//		InsertionX.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i] + " "); 
		}
		
	}
}
