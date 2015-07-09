/** 
 * @author wxf 
 * @version 2015年7月2日 上午11:15:51 
 * 类说明 
 */
public interface State {
	public void open(Lift lift);
	
	public void close(Lift lift);
	
	public void stop(Lift lift);
	
	public void run(Lift lift);
}
