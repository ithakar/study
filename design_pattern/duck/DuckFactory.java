class DuckFactory implements Factory{
	public Quackable createDuckCall(){
		return new CountQuack(new DuckCall());
	}
	public Quackable createMallardDuck(){
		return new CountQuack(new MallardDuck());
	}
	public Quackable createRedheadDuck(){
		return new CountQuack(new RedheadDuck());
	}
	public Quackable createRubberDuck(){
		return new CountQuack(new RubberDuck());
	}
	public Quackable createGoose(){
		return new CountQuack(new GooseAdapter(new Goose()));
	}
}