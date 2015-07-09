package algorithm.fundamentals;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/** 
 * @author wxf 
 * @version 2015年3月9日 上午11:24:57 
 * 类说明 
 */
public class QuickFind extends UnionFind{

	public QuickFind(int N) {
		super(N);
		// TODO Auto-generated constructor stub
	}
	
	public int find(int p) {
		// TODO Auto-generated method stub
		return a[p];
	}
	
	public void union(int p, int q) {
		// TODO Auto-generated method stub
//		super.union(p, q);
		int pID = find(p);
		int qID = find(q);
		if (pID == qID) {
			return;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == pID) {
				a[i] = qID;
			}
		}
		count--;
	}
	
	public static void main(String[] args) {
		int N = StdIn.readInt();
		QuickFind uf = new QuickFind(N);
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
