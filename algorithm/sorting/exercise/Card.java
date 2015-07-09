package algorithm.sorting.exercise;

import java.util.Random;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;
import algorithm.sorting.Example;
import algorithm.sorting.Selection;

/** 
 * @author wxf 
 * @version 2015年3月3日 下午5:55:27 
 * 类说明 
 */
public class Card extends Example{
	
	
	public static void main(String[] args){
		Double[] a = new Double[52];
		int j = 0;
		StdOut.println("the card is like this：");
		for (int i = 1; i < 5; i++) {
			while(j < i*13){
				a[j] = (double) i;
				StdOut.print(a[j] + " ");
				j++;
			}
		}
		StdOut.println();
		
		Random random = new Random();
		
		
		random(a);
		
		StdOut.println("random the card：");
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i] + " ");
		}
		Selection.sort(a);
		StdOut.println("\nsort the card：");
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i] + " ");
		}
	}
	
	public static void random(Comparable[] a){
		Random random = new Random();
		
		for (int i = 0; i < a.length; i++) {
			int p = random.nextInt(a.length-1);
			Comparable temp = (Comparable) a[i];
			a[i] = a[p];
			a[p] = temp;
		}
//		return a;
	}
	
}
