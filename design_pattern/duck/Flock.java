import java.util.*;
class Flock implements Quackable, Obsevable{
	private ArrayList duckList;

	private ArrayList obseverList;

	public Flock(){
		duckList = new ArrayList();
		obseverList = new ArrayList();
	}

	public void add(Quackable duck){
		duckList.add(duck);
	}

	public void quack(){
		Iterator iterator = duckList.iterator();
		while(iterator.hasNext()){
			Quackable duck = (Quackable)iterator.next();
			notifyObserve(duck);
			duck.quack();
		}
	}

	public void registerObserve(Observe o){
		obseverList.add(o);
	}
	public void removeObserve(Observe o){
		obseverList.remove(o);
	}
	public void notifyObserve(Quackable duck){
		Iterator iterator = obseverList.iterator();
		while(iterator.hasNext()){
			Observe observe = (Observe)iterator.next();
			observe.update(duck);
		}
	}
}