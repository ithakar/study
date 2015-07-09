package algorithm.fundamentals;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;



public class TestBag {
	public static void main(String[] args) {
		Bag<Double> bag = new Bag<Double>();
		while (!StdIn.isEmpty()){
			bag.add(StdIn.readDouble());
		}
		
		int N = bag.size();
		
		double sum = 0.0;
		for (double x : bag) {
			sum += x;
		}
		
		double mean = sum/N;
		
		StdOut.printf("Mean: %.2f\n", mean);
	}
}