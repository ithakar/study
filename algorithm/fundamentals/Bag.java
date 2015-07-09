package algorithm.fundamentals;

import java.util.Iterator;

/** 
 * @author wxf 
 * @version 2015年2月27日 上午11:58:32 
 * 类说明 
 */
public class Bag<E> implements Iterable<E>{
	
	private int num;
	
	class BNode<E>{
		private E value;
		public BNode(E value){
			this.value = value;
		}
	}
	
	public Boolean isEmpty(){
		return num==0;
	}
	
	public void add(E e){
		BNode<E> node = new BNode(e);
		num++;
	}
	
	public int size(){
		return num;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
