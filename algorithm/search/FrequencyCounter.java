package algorithm.search;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/** 
 * @author wxf 
 * @version 2015年3月4日 下午5:32:49 
 * 类说明 
 */
public class FrequencyCounter {
	public static void main(String[] args) {
		int minlen = Integer.parseInt(args[0]);
//		SequentialSearcST<String, Integer> st = new SequentialSearcST<String, Integer>();
		BinarySearchTree<String, Integer> st = new BinarySearchTree<String, Integer>();
		
		while(!StdIn.isEmpty()){
			String word = StdIn.readString();
			
			if (word.length() < minlen) {
				continue;
			}
			
//			if (!st.contains(word)) {
//				st.put(word, 1);
//			} else {
//				st.put(word, st.get(word) + 1);
//			}
		}
		
		String max = " ";
		st.put(max, 0);
//		for (String word : st.keys()) {
//			if (st.get(word) > st.get(max)) {
//				max = word;
//			}
//		}
		
		StdOut.println(max + " " + st.get(max));
	}
}
