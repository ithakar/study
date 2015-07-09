class DuckSimulator{
	public static void main(String[] args) {
		

		simulate();
	}

	public static void simulate(){
		DuckFactory factory = new DuckFactory();
		Flock flock = new Flock();
		BoardShow show = new BoardShow();

		Quackable duckcall = factory.createDuckCall();
		Quackable mallardDuck = factory.createMallardDuck();
		Quackable redheadDuck = factory.createRedheadDuck();
		Quackable goose = factory.createGoose();

		flock.add(duckcall);
		flock.add(mallardDuck);
		flock.add(redheadDuck);
		flock.add(goose);

		flock.registerObserve(show);

		flock.quack();

		// simulate(flock);
		// simulate(duckcall);
		// simulate(mallardDuck);
		// simulate(redheadDuck);
		// simulate(goose);

		System.out.println("quack count is " + CountQuack.getCount());
	}

	public static void simulate(Quackable duck){
		duck.quack();
	}
}