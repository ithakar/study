interface Obsevable{
	public void registerObserve(Observe duck);
	public void removeObserve(Observe duck);
	public void notifyObserve(Quackable duck);
}