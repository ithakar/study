/** 
 * @author wxf 
 * @version 2015年7月2日 上午11:20:14 
 * 类说明 
 */
public class runLift implements State {

	@Override
	public void open(Lift lift) {
		// TODO Auto-generated method stub
		lift.setState(lift.getStopLift());
		System.out.println("lift stoping");
		lift.setState(lift.getOpenLift());
		System.out.println("lift door opening");
	}

	@Override
	public void close(Lift lift) {
		// TODO Auto-generated method stub
		System.out.println("lift door already closed");
	}

	@Override
	public void stop(Lift lift) {
		// TODO Auto-generated method stub
		lift.setState(lift.getStopLift());
		System.out.println("lift stoping");
	}

	@Override
	public void run(Lift lift) {
		// TODO Auto-generated method stub
		System.out.println("lift already running");
	}


}
