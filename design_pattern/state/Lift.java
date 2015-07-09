/** 
 * @author wxf 
 * @version 2015年7月2日 上午11:15:01 
 * 类说明 
 */
public class Lift {
	private State openLift;
	private State runLift;
	private State stopLift;
	private State closeLift;
	

	private State state;
	
	public Lift() {
		// TODO Auto-generated constructor stub
		this.openLift = new OpenList();
		this.runLift = new runLift();
		this.stopLift = new stopLift();
		this.closeLift = new closeLift();
		setState(closeLift);
	}
	
	public void run() {
		// TODO Auto-generated method stub
		state.run(this);
	}

	public void stop() {
		// TODO Auto-generated method stub
		state.stop(this);
	}

	public void open() {
		// TODO Auto-generated method stub
		state.open(this);
	}

	public void close() {
		// TODO Auto-generated method stub
		state.close(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	

	public State getOpenLift() {
		return openLift;
	}

	public void setOpenLift(State openLift) {
		this.openLift = openLift;
	}

	public State getRunLift() {
		return runLift;
	}

	public void setRunLift(State runLift) {
		this.runLift = runLift;
	}

	public State getStopLift() {
		return stopLift;
	}

	public void setStopLift(State stopLift) {
		this.stopLift = stopLift;
	}

	public State getCloseLift() {
		return closeLift;
	}

	public void setCloseLift(State closeLift) {
		this.closeLift = closeLift;
	}
}
