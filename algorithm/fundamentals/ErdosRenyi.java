package algorithm.fundamentals;

import java.util.Random;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;
import edu.princeton.cs.introcs.StdStats;
import edu.princeton.cs.introcs.Stopwatch;


/** 
 * @author wxf 
 * @version 2015年3月9日 下午3:13:14 
 * 类说明 
 */
public class ErdosRenyi {
	
	public static int count(int N) {
        int edges = 0;
        QuickUnion uf = new QuickUnion(N);
        while (uf.count() > 1) {
            int i = StdRandom.uniform(N);
            int j = StdRandom.uniform(N);
            uf.union(i, j);
            edges++;
        }
        return edges;
    }
	
	public static int method(UnionFind uf, int N) {
        int edges = 0;
//        uf = new QuickUnion(N);
        while (uf.count() > 1) {
            int i = StdRandom.uniform(N);
            int j = StdRandom.uniform(N);
            uf.union(i, j);
            edges++;
        }
        return edges;
    }
	
	public static double time(int N, int M){
		Stopwatch timer1 = new Stopwatch();
		QuickFind qf = new QuickFind(N);
		for (int i = 0; i < M; i++) {
			method(qf, N);
		}
		double t1 = timer1.elapsedTime();
		
		Stopwatch timer2 = new Stopwatch();
		QuickUnion uf = new QuickUnion(N);
		for (int i = 0; i < M; i++) {
			method(qf, N);
		}
		double t2 = timer2.elapsedTime();
		
		return t1/t2;
	}

    public static void main(String[] args) {
    	
    	int M = StdIn.readInt();     // number of vertices
        int N = StdIn.readInt();     // number of vertices
        int T = StdIn.readInt();     // number of trials
        int[] edges = new int[T];

        // repeat the experiment T times
        for (int t = 0; t < T; t++) {
            edges[t] = count(N);
        }

        // report statistics
        StdOut.println("quick union / quick find = " + time(N, M));
        StdOut.println("1/2 N ln N = " + 0.5 * N * Math.log(N));
        StdOut.println("mean       = " + StdStats.mean(edges));
        StdOut.println("stddev     = " + StdStats.stddev(edges));
    }
}
