package algorithm.fundamentals;
/** 
 * @author wxf 
 * @version 2015年3月9日 上午11:13:04 
 * 类说明 
 */
public class QuickUnion extends UnionFind{

	public QuickUnion(int N) {
		super(N);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int find(int p) {
		// TODO Auto-generated method stub
//		return super.find(p);
		while(a[p] != p){
			p = a[p];
		}
		return p;
	}
	
	@Override
	public void union(int p, int q) {
		// TODO Auto-generated method stub
		int pROOT = find(p);
		int qRoot = find(q);
		
		if (connect(pROOT, qRoot)) {
			return;
		}
		
		a[pROOT] = qRoot;
		
//		super.union(p, q);
		count--;
	}

}
