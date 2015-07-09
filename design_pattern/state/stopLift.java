/** 
 * @author wxf 
 * @version 2015年7月2日 上午11:20:19 
 * 类说明 
 */
public class stopLift implements State {

	@Override
	public void open(Lift lift) {
		// TODO Auto-generated method stub
		lift.setState(lift.getOpenLift());
		System.out.println("Lift door opening");
	}

	@Override
	public void close(Lift lift) {
		// TODO Auto-generated method stub
		lift.setState(lift.getCloseLift());
		System.out.println("Lift door closing");
	}

	@Override
	public void stop(Lift lift) {
		// TODO Auto-generated method stub
		System.out.println("Lift already stoped");
	}

	@Override
	public void run(Lift lift) {
		// TODO Auto-generated method stub
		lift.setState(lift.getRunLift());
		System.out.println("Lift start running ");
	}

}
