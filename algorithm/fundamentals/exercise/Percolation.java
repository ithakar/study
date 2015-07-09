package algorithm.fundamentals.exercise;

import java.util.Random;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/** 
 * @author wxf 
 * @version 2015年3月10日 上午10:32:46 
 * 类说明 
 */
public class Percolation {
	private static Integer[] site;
	private static int count ;
	
	public Percolation(int N){
		site = new Integer[N*N];
		count = N*N;
		random(site);
	}
	
	public void random(Integer[] a){
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] =  random.nextInt(2);
		}
	}
	
	
	public static boolean isOpen(int[] a, int p){
		return a[p] == 1;
	}
	
	
	public static void open(int[] a, int p){
		if (a[p] == 1) {
			return;
		}
		a[p] = 1;
	}
	
	public static boolean isFull(int[] a, int N){
		for (int i = 0; i < N; i++) {
			for (int j = N*N -1; j >= N*(N-1); j--) {
//				if (connected(a,i, j)) {
//					return true;
//				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int N = StdIn.readInt();
		new Percolation(N);
		for (int i = 0; i < site.length; i++) {
			StdOut.print(site[i] + "  ");
			if ((i+1)%N == 0 ) {
				StdOut.println();
			}
		}
		
		StdOut.println();
		boolean flag = false;
		while(true){
			
			
			
			
			Random random = new Random();
			
//			int i = StdIn.readInt();
//			int j = StdIn.readInt();
			int i = random.nextInt(64);
			int j = random.nextInt(64);
			System.out.println("i: " + i + "  j: " + j);
			
//			union(i , j);
			
			if (count < 0 || flag ) {
				break;
			}
		}
	}
}
