package algorithm.search;
public class Merge{
	
	private static Comparable[] aux;

	public static void sort(Comparable[] a){
		sort(a, 0, a.length-1);		
	}

	public static void sort(Comparable[] a, int low, int high){
		if (low >= high) {
			return;
		}
		if (a[low].compareTo(a[high]) > 0) {
			Comparable c = a[low];
			a[low] = a[high];
			a[high] = c;
		}
		int mid = low + (high-low)/2;

		sort(a, low, mid);
		sort(a, mid+1, high);
	}
}