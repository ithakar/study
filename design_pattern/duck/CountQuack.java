class CountQuack implements Quackable{

	Quackable duck;

	public CountQuack(Quackable duck){
		this.duck = duck;
	}

	public static int getCount(){
		return count;
	}

	private static int count;

	public void quack(){
		duck.quack();
		count++;
	}
}