package algorithm.sorting;
/** 
 * @author wxf 
 * @version 2015年3月2日 下午4:06:43 
 * 类说明 
 */
public class MergeBU extends Example{
	
	private static Comparable[] aux;
	
	public static void sort(Comparable[] a){
		for (int i = 1; i < a.length; i+=i) {
			for (int j = 0; j < a.length - i; j+=i+i) {
				Merge.merge(a, j, j+i-1, Math.min(j + i + i -1   , a.length-1));
			}
		}
	}
}
