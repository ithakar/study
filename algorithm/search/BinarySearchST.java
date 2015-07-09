package algorithm.search;

import algorithm.sorting.Example;
import algorithm.sorting.Quick;

/** 
 * @author wxf 
 * @version 2015年3月4日 下午3:48:40 
 * 类说明 
 */
public class BinarySearchST<Key extends Comparable<Key>, Value>	 extends Example{
	private Key[] keys;
	private Value[] vals;
	
	private int N;
	
	@SuppressWarnings("unchecked")
	public BinarySearchST(int capacity) {
		// TODO Auto-generated constructor stub
		keys = (Key[]) new Comparable[capacity];
		vals = (Value[]) new Comparable[capacity];
	}
	
	public Value get(Key key){
		if (isEmpty()){
			return null;
		}
		int i = rank(key);
		if (i < N && keys[i].equals(key)) {
			return vals[i];
		}
		return null;
	}
	
	public void put(Key key, Value value){
		int i = rank(key);
		if (i < N && keys[i].equals(key)) {
			vals[i] = value;
			return;
		}
		for (int j = N; j > i; j--) {
			keys[j] = keys[j-1];
			vals[j] = vals[j-1];
		}
		keys[i] = key;
		vals[i] = value;
		N++;
	}
	
	public void delete(Key key){
		if (get(key) == null) {
			return;
		}
		int i = rank(key);
		for (int j = i; j < N-1; j++) {
			vals[j] = vals[j+1];
			keys[j] = keys[j+1];
		}
		N--;
	}

	private int rank(Key key) {
		// TODO Auto-generated method stub
		Quick.sort(keys);
		int count = 0;
		for (int i = 0; i < keys.length; i++) {
			if (key.compareTo(keys[i]) == 0) {
				return i;
			}
		}
		return 0;
	}
	

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return keys.length == 0;
	}
}
