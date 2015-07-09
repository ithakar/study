package algorithm.fundamentals;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/** 
 * @author wxf 
 * @version 2015年3月3日 下午5:13:07 
 * 类说明 
 */
public class UnionFind {
	
	protected static int count ;
	protected static int[] a;
	
	public UnionFind(int N) {
		// TODO Auto-generated constructor stub
		count = N;
		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = i;
		}
	}
	
	public void union(int p, int q){
//		a[p] = a[q];
//		count++;
	}
	
	public boolean connect(int p, int q){
		return find(p) == find(q);
	}
	
	public int find(int p){
		return a[p];
	}
	
	public int count(){
		return count;
	}
	
	public static void main(String[] args) {
		int N = StdIn.readInt();
		UnionFind uf = new UnionFind(N);
		while(!StdIn.isEmpty()){
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if (uf.connect(p, q)) {
				continue;
			}
			uf.union(p, q);
			StdOut.println(p + " " + q);
		}
		StdOut.println(uf.count() + "components");
	}
}
