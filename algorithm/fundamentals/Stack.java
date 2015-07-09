package algorithm.fundamentals;

import java.util.Iterator;

class Stack<Item> implements Iterable<Item>{

	private Item[] a;

	private int N = 0;

	public  boolean isEmpty(){
		return N == 0;
	}

	public int size(){
		return N;
	}

	public Stack(int cap){
		a = (Item[]) new Object[cap];
	}

	public Item peek(){
		if (isEmpty()) {
			return null;
		}
		return a[N-1];
	}

	public void push(Item item){
		if (size() >= a.length) {
			resize( 2*a.length);
		}
		a[N++] = item;
	}

	public Item pop(){
		Item item = a[--N];
		a[N] = null;
		if (size() <= a.length/4 && !isEmpty()) {
			resize(a.length/2);
		}
		return item;
	}

	private void resize(int length){
		Item[] aux = (Item[]) new Object[length]; 
		for (int i = 0; i < size(); i++) {
			aux[i] = a[i];
		}
		a = aux;
	}

	public Iterator<Item> iterator(){
		return new ReverseArrayIterator();
	}

	private class ReverseArrayIterator implements Iterator<Item>{
		private int i = N;

		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i > 0;
		}

		public Item next() {
			// TODO Auto-generated method stub
			return a[--i];
		}

 		public void remove() {
			// TODO Auto-generated method stub
			
		}
	}

	
}