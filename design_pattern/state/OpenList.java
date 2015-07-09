/** 
 * @author wxf 
 * @version 2015年7月2日 上午11:19:28 
 * 类说明 
 */
public class OpenList implements State {

	@Override
	public void open(Lift lift) {
		// TODO Auto-generated method stub
		System.out.println("Lift door already opened");
	}

	@Override
	public void close(Lift lift) {
		// TODO Auto-generated method stub
		System.out.println("Lift door closing");
		lift.setState(lift.getCloseLift());
	}

	@Override
	public void stop(Lift lift) {
		// TODO Auto-generated method stub
		System.out.println("Lift already stoped");
	}

	@Override
	public void run(Lift lift) {
		// TODO Auto-generated method stub
		lift.setState(lift.getCloseLift());
		System.out.println("Lift door closing");
		lift.setState(lift.getRunLift());
		System.out.println("Lift running");
	}


}
