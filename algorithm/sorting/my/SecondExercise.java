package algorithm.sorting.my;

import java.awt.Point;
import java.util.Random;

import algori.FordFulkerson;
import sun.text.normalizer.NormalizerBase.QuickCheckResult;

/** 
 * @author wxf 
 * @version 2015年3月11日 下午4:37:43 
 * 类说明 
 */
public class SecondExercise {
	
	private static Point[] a = new Point[20];
	Random random = new Random();
	
	public SecondExercise() {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < a.length; i++) {
			int x = random.nextInt(20);
			int y = random.nextInt(20);
			Point p = new Point(x, y);
			a[i] = p;
		}
	}
	
	public static void prt(int[] a){
		
	}
	
	public static double slope(Point p, Point q){
//		double slp = Math.abs((p.y - q.y)/(p.x - q.x));
		if ((p.x - q.x) == 0 ) {
			return 0;
		}
		return Math.abs((double)(p.y - q.y)/(double)(p.x - q.x));
	}
	
	public static void main(String[] args) {
		new SecondExercise();
		double[] slp = new double[20];
		for (int i = 0; i < a.length-1; i++) {
//			((Point) a[0]).slopeTo(a[i]);
			slp[i] = slope(a[i], a[i+1]);
			System.out.print("(" + a[i] + " " + i +")");
		}
		
		System.out.println();
		
		for (int i = 0; i < slp.length; i++) {
			System.out.print(slp[i] + " ");
		}
	}
	
	
	
	
}
