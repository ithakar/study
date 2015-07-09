/** 
 * @author wxf 
 * @version 2015年7月1日 上午11:27:05 
 * 类说明 
 */
interface Observable {
	public void registerObserve(Observe observe);
	public void removeObserve(Observe observe);
	public void notifyObserve();
}
