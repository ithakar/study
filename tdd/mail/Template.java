package tdd.mail;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/** 
 * @author wxf 
 * @version 2015年7月9日 下午4:44:50 
 * 类说明 
 */
public class Template {
	
	private String text;
	private Map<String, String> map;

	public Template(String text) {
		this.text = text;
		this.map = new HashMap<String, String>();
	}

	public void set(String variable, String value) {
		this.map.put(variable, value);
	}

	public String evalute() throws MissValueException{
		String result = replaceVariable(text);
		checkForMissingValues(result);
		return result;
	}
	
	private String replaceVariable(String text){
		for (Entry<String, String> entry : map.entrySet()) {
			String each = "\\$\\{" + entry.getKey() + "\\}";
			text = text.replaceAll(each, entry.getValue());
		}
		return text;
	}
	
	private void checkForMissingValues(String value) throws MissValueException {
		if (value.matches(".*\\$\\{.+\\}.*")) {
			System.out.println("value is null");
			throw new MissValueException();
		}
	}

}
