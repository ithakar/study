package tdd.mail;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/** 
 * @author wxf 
 * @version 2015年7月9日 下午4:39:07 
 * 类说明 
 */
public class TestTemplate {
	
	private Template t;
	
	@Before
	public void init() throws Exception{
		t = new Template("${one}, ${two}, ${three}");
		t.set("one", "1");
		t.set("two", "2");
		t.set("three", "3");
		assertEquals("1, 2, 3", t.evalute());
	}
	
	@Test
	public void multipleValiable() throws Exception{
		assertTemplateEvaluatesTo("1, 2, 3");
	}
	
	@Test
	public void unkownValiable() throws Exception{
		t.set("anythone", "anything");
		assertTemplateEvaluatesTo("1, 2, 3");
	}
	
	@Test
	public void missingValueException() throws Exception{
		try {
			new Template("${foo}").evalute();
			fail("evalute should throw a exception if a variable was left without value");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void assertTemplateEvaluatesTo(String expected) throws Exception{
		assertEquals(expected, t.evalute());
	}
}
