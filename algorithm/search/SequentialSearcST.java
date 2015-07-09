package algorithm.search;

import java.util.Iterator;

/** 
 * @author wxf 
 * @version 2015年3月4日 下午3:02:12 
 * 类说明 
 */
@SuppressWarnings("rawtypes")
public class SequentialSearcST<Key , Value>  implements Iterable {
	
	private int count;
	private Node first;
	
	private class Node{
		Key key;
		Value value;
		Node next;
		
		public Node(Key key, Value value, Node next) {
			// TODO Auto-generated constructor stub
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	public SequentialSearcST() {
		// TODO Auto-generated constructor stub
	}
	
	public Value get(Key key){
		for (Node x = first; !isEmpty(); x=x.next) {
			if (x.value.equals(key)) {
				return x.value;
			}
		}
		count--;
		return null;
	}
	
	public void put(Key key, Value value){
		for (Node x = first; !isEmpty(); x=x.next) {
			if (x.value.equals(key)) {
				x.value = value;
				return;
			}
		}
		Node node = new Node(key, value, first);
		first = node;
		count++;
	}
	
	public int size(Key low, Key high){
		if (high.equals(low)) {
			return 0;
		} else if (contains(high)){
			return rank(high)-rank(low)+1;
		}
		return 0;
	}

	private int rank(Key high) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count==0;
	}

	public boolean contains(Key key) {
		// TODO Auto-generated method stub
		if (get(key) == null) {
			return false;
		}
		return true;
	}
	
	

	public Object keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
