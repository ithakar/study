package algorithm.fundamentals;
/** 
 * @author wxf 
 * @version 2015年3月9日 下午2:30:08 
 * 类说明 
 */
public class WeightQuickUnion extends UnionFind{

	private int[] sz;
	
	public WeightQuickUnion(int N) {
		
		super(N);
		sz = new int[N];
		for (int i = 0; i < N; i++) {
			sz[i] = i;
		}
		// TODO Auto-generated constructor stub
	}
	
	public int find(int p){
		while(p != a[p]){
			p = a[p];
		}
		return p;
	}
	
	@Override
	public void union(int p, int q) {
		// TODO Auto-generated method stub
//		super.union(p, q);
		int i = find(p);
		int j = find(q);
		
		if (i == j) {
			return;
		}
		
		if (sz[i] < sz[j]) {
			a[i] = j;
			sz[j]+= sz[j];
		} else {
			a[j] = i;
			sz[i] += sz[j];
		}
		
		count--;
	}
	
	
}
