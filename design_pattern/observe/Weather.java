
import java.util.ArrayList;
import java.util.List;

/** 
 * @author wxf 
 * @version 2015年7月1日 上午11:14:10 
 * 类说明 
 */
public class Weather implements Observable{
	
	private List<Observe> list = new ArrayList<Observe>();
	private double sun;
	private double wind;
	private double temp;
	
	public void changed(){
		notifyObserve();
	}

	public double getSun() {
		return sun;
	}

	public double getWind() {
		return wind;
	}

	public double getTemp() {
		return temp;
	}
	
	public void set(double temp, double sun, double wind){
		this.temp = temp;
		this.sun = sun;
		this.wind = wind;
		
		changed();
	}

	@Override
	public void registerObserve(Observe observe) {
		// TODO Auto-generated method stub
		list.add(observe);
	}

	@Override
	public void removeObserve(Observe observe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserve() {
		// TODO Auto-generated method stub
		for (Observe observe : list) {
			observe.update( temp, sun, wind);
		}
	}

}
