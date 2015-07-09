package algorithm.sorting;

import algorithm.sorting.exercise.ChangeMerge;
import algorithm.sorting.exercise.InsertionX;
import algorithm.sorting.exercise.MergeX;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;
import edu.princeton.cs.introcs.Stopwatch;

/** 
 * @author wxf 
 * @version 2015年3月2日 上午10:26:01 
 * 类说明 
 */
public class SortCompare {
	
	public static double timeRandomInput(String alg, int N, int T){
		double total=0.0;
		Double[] a = new Double[N];
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < N; j++) {
				a[j] = StdRandom.uniform();
			}
			total += time(alg, a);
		}
		return total;
	}
	
	public static double time(String alg, Double[] a){
		Stopwatch timer = new Stopwatch();
		if (alg.equals("Insertion")) {
			Insertion.sort(a);
		}
		if (alg.equals("InsertionX")) {
			InsertionX.sort(a);
		}
		if (alg.equals("Selection")) {
			Selection.sort(a);
		}
		if (alg.equals("Shell")) {
			Shell.sort(a);
		}
		if (alg.equals("Merge")) {
			Merge.sort(a);
		}
		if (alg.equals("MergeX")) {
			MergeX.sort(a);
		}
		if (alg.equals("ChangeMerge")) {
			ChangeMerge.sort(a);
		}
		if (alg.equals("Quick")) {
			Quick.sort(a);
		}
//		if (alg.equals("Heap")) {
//			Heap.sort(a);
//		}
		return timer.elapsedTime();
	}
	
	public static void main(String[] args) {
//		String alg1 = args[0];
//		String alg2 = args[1];
//		String alg2 = "MergeX";
		String alg2 = "ChangeMerge";
//		String alg2 = "Selection";
		String alg1 = "Merge";
//		String alg2 = "Shell";
//		String alg3 = "Merge";
//		int N = Integer.parseInt(args[2]);
//		int T = Integer.parseInt(args[3]);
		int N = 1000;
		int T = 5000;
		
		double t1 = timeRandomInput(alg1, N, T);
		double t2 = timeRandomInput(alg2, N, T);
//		double t3 = timeRandomInput(alg3, N, T);
		
		StdOut.printf("For %d random Doubles\n  %s is", N, alg1);
//		StdOut.printf(" %.1f times faster than %s\n", t2/t1,alg2);
		StdOut.printf(" %.1f times faster than %s\n", t2/t1,alg2);
	}
}
