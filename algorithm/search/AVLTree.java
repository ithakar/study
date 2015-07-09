package algorithm.search;


/** 
 * @author wxf 
 * @version 2015年3月5日 下午4:08:35 
 * 类说明 
 */
public class AVLTree<Key extends Comparable<Key>, Value> {
	
	private Node root;
	
	@SuppressWarnings("unused")
	private class Node{
		Key key;
		Value val;
		Node left;
		Node right;
		int N;
		
		public Node(Key key, Value val, int N) {
			// TODO Auto-generated constructor stub
			this.key = key;
			this.val = val;
			this.N = N;
		}
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
	
	public int size() {
		// TODO Auto-generated method stub
		return size(root); 
	}

	private int size(AVLTree<Key, Value>.Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		}
		return node.N;
	}
	
	public Node leftLeft(Node k1, Node k2){
		k2 = k1.left;
		k1.left = k2.right;
		k2.right = k1;
		
		k2.N = size(k2.left) + size(k2.right) + 1;
		k1.N = size(k1.left) + size(k1.right) + 1;
		
		return k2;
	}
	
	public Node rightRight(Node k1, Node k2){
		k2 = k1.right;
		k1.right = k2.left;
		k2.left = k1;
		
		k2.N = size(k2.left) + size(k2.right) + 1;
		k1.N = size(k1.left) + size(k1.right) + 1;
		
		return k2;
	}
	
	public void put(Key key, Value val){
		root = put(root, key, val);
	}
	
	private AVLTree<Key, Value>.Node put(AVLTree<Key, Value>.Node node, Key key, Value val) {
		// TODO Auto-generated method stub
		if (node == null) {
			return new Node(key, val, 1);
		}
		int cmp = key.compareTo(node.key);
		if (cmp < 0) {
			node.left = put(node.left, key, val);
		} else if (cmp > 0){
			node.right = put(node.right, key, val);
		} else {
			node.val = val;
		}
		node.N = size(node.left) + size(node.right) + 1;
		return node;
	}


	public Value get(Key key){
		return get(root, key);
		
	}

	private Value get(Node node, Key key) {
		// TODO Auto-generated method stub
		if (node == null) {
			return null;
		}
		int cmp = key.compareTo(node.key);
		if (cmp < 0) {
			return get(node.left, key);
		} else if (cmp > 0){
			return get(node.right, key);
		} else {
			return node.val;
		}
	}
	
	public Key min(){
		return min(root).key;
	}

	private Node min(AVLTree<Key, Value>.Node x) {
		// TODO Auto-generated method stub
		if (x.left == null) {
			return x;
		}
		return min(x.left);
	}
	
	public Key max(){
		return max(root).key;
	}

	private Node max(AVLTree<Key, Value>.Node x) {
		// TODO Auto-generated method stub
		if (x.right == null) {
			return x;
		}
		return max(x.right);
	}
	
	public Key floor(Key key){
		Node x = floor(root, key);
		if (x == null) {
			return null;
		}
		return x.key;
	}

	private Node floor(AVLTree<Key, Value>.Node x, Key key) {
		// TODO Auto-generated method stub
		if (x == null) {
			return null;
		}
		int cmp = key.compareTo(x.key);
		if (cmp == 0) {
			return x;
		}
		if (cmp < 0) {
			return floor(x.left, key);
		} 
		Node node = floor(x.right, key);
		if (node == null) {
			return x;
		} else {
			return node;
		}
	}
	
	public Key select(int k){
		Node node = select(root, k);
		if (node == null) {
			return null;
		}
		return node.key;
	}

	private Node select(AVLTree<Key, Value>.Node x, int k) {
		// TODO Auto-generated method stub
		if (x == null) {
			return null;
		}
		if (k < size(x.left)) {
			return select(x.left, k);
		} else if (k > size(x.left)){
			k = k - size(x) - 1;
			return select(x.right, k);
		} else {
			return x;
		}
	}
	
	public int rank(Key key){
		return rank(root, key);
	}

	private int rank(Node x, Key key) {
		// TODO Auto-generated method stub
		if (x == null) {
			return 0;
		}
		int cmp = key.compareTo(x.key);
		if (cmp < 0) {
			return rank(x.left, key);
		} else if ( cmp > 0){
			return 1 + size(x.left) + rank(x.right, key);
		} else {
			return size(x.left);
		}
	}
	
	public void deleteMin(){
		deleteMin(root);
	}
	
	private AVLTree<Key, Value>.Node deleteMin(AVLTree<Key, Value>.Node x) {
		// TODO Auto-generated method stub
		if (x.left == null) {
			return x.right;
		}
		x.left = deleteMin(x.left);
		x.N = size(x.left) + size(x.right) + 1;
		return x;
	}

	public void delete(Key key){
		delete(root, key);
	}

	private AVLTree<Key, Value>.Node delete(AVLTree<Key, Value>.Node x, Key key) {
		// TODO Auto-generated method stub
		if (x == null) {
			return null;
		}
		int cmp = key.compareTo(x.key);
		if (cmp < 0) {
			x.left = delete(x.left, key);
		} else if (cmp > 0) {
			x.right = delete(x.right, key);
		} else {
			if (x.right == null) {
				return x.left;
			}
			if (x.left == null) {
				return x.right;
			}
			Node t = x;
			x = min(t.right);
			x.right = deleteMin(t.right);
			x.left = t.left;
		}
		x.N = size(x.left) + size(x.right) + 1;
		return x;
	}

	private Node successor(Node x) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	
}
