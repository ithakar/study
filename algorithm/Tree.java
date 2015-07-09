package algorithm;
class Tree<T extends Comparable<T>>{

	private class Node<T extends Comparable<T>>{
		Node left;
		Node right;
		T value;
		int N;

		public Node(Node<T> left, Node<T> right, T value){
			this.left = left;
			this.right = right;
			this.value = value;
		}
	}

	private Node<T> root;
	private int size;
	
	public static void main(String[] args) {
		Integer[] a = {123, 45 , 65, 132 , 56, 78};
	}

	public boolean isEmpty(){
		return size()==0;
	}

	public int size(){
		return size(root);
	}

	private int size(Tree<T>.Node<T> root2) {
		// TODO Auto-generated method stub
		if (root2 == null) {
			return 0;
		}
//		int left = size(root2.left);
//		int right = size(root2.right);
//		return left + right + 1;
		return root2.N;
	}

	public void insert(T value){
		root = insert(root, value);
	}

	private Node insert(Node x, T value) {
//		Node<T> node = new Node<T>(null, null, value);
		if (x == null) {
			return new Node<T>(null, null, value);
		}		
		int cmp = x.value.compareTo(value);
		if (cmp > 0) {
			x.left = insert(x.left, value);
		}else{
			x.right = insert(x.right, value);
		}
		
		x.N = size(x.left) + size(x.right)+1;
		return x;
	}

	public Node<T> get(T value){
		return get(root, value);
	}

	private Tree<T>.Node<T> get(Tree<T>.Node<T> x, T value) {
		// TODO Auto-generated method stub
		if (x == null) {
			return x;
		}
		int cmp = x.value.compareTo(value);
		if (cmp > 0) {
			return get(x.left, value);
		}else if(cmp < 0){
			return get(x.right, value);
		}
			return x;
		
//		return x;
	}
	
	public T min(){
		return min(root).value;
	}

	private Tree<T>.Node<T> min(Tree<T>.Node<T> x) {
		// TODO Auto-generated method stub
		if (x.left == null) {
			return x;
		}
		return min(x.left);
	}
	
	public T max(){
		return max(root).value;
	}

	private Tree<T>.Node<T> max(Tree<T>.Node<T> x) {
		// TODO Auto-generated method stub
		if (x.right == null) {
			return x;
		}
		return max(x.right);
	}
	
	public void preTree(){
		preTree(root);
	}

	private void preTree(Tree<T>.Node<T> x) {
		// TODO Auto-generated method stub
		if (x == null) {
			return;
		}
		System.out.print(x.value + " ");
		preTree(x.left);
		preTree(x.right);
	}
	
	public void midTree(){
		midTree(root);
	}

	private void midTree(Tree<T>.Node<T> x) {
		// TODO Auto-generated method stub
		if (x == null) {
			return;
		}
		midTree(x.left);
		System.out.print(x.value + " ");
		midTree(x.right);
	}
	
	public void postTree(){
		postTree(root);
	}

	private void postTree(Tree<T>.Node<T> x) {
		// TODO Auto-generated method stub
		if (x == null) {
			return;
		}
		postTree(x.left);
		postTree(x.right);
		System.out.print(x.value + " ");
	}
	
	public void delete(T value) {
		// TODO Auto-generated method stub
		root = delete(root, value);
	}

	private Tree<T>.Node<T> delete(Tree<T>.Node<T> x, T value) {
		// TODO Auto-generated method stub
		if (x == null) {
			return x;
		}
//		Node<T> right = node.right;
//		node = node.left;
//		min(right).left = node.left; //more complicated
//		node.right = right;
		int cmp = x.value.compareTo(value);
		if (cmp > 0) {
			x.left = delete(x.left, value);	
		} else if (cmp < 0) {
			x.right = delete(x.right, value);	
		} else {
//			Node<T> node = get(value);
			if (x.left != null) {
				max(x.left).right = x.right;
				x = x.left;
				return x;
			}
			x = x.right;
			x.N = size(x.left) + size(x.right) + 1;
			return x;
		}
//		x.N = size(x.left) + size(x.right) + 1;
//		return x;
		return x;
	}
}