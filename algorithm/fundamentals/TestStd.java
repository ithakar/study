package algorithm.fundamentals;
// import StdIn.java;
class TestStd{
	public static void main(String[] args) {
		// int a = StdIn.readInt();
		// System.out.println("input number is: " + a);

		Stack<String> ms = new Stack<String>(10);
		ms.push("Spring");
		ms.push("Summer");
		ms.push("Autumn");
		ms.push("Winter");
		ms.push("Spring");
		ms.push("Summer");
		ms.push("Autumn");
		ms.push("Winter");
		ms.push("Spring");
		ms.push("Summer");
		ms.push("Autumn");
		ms.push("Winter");
		System.out.print(ms.pop()+" ");
		System.out.print(ms.peek()+" ");
		System.out.print(ms.pop()+" ");
		for (String s: ms) {
			System.out.print(s + " ");
		}
		System.out.print(ms.isEmpty()+" ");
	}
}