package demo;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.fail;

import java.util.LinkedHashMap;

import org.junit.Before;
import org.junit.Test;

import test.template.AbstractChangeNumMethod;
import test.template.concrete.FirstStageConcreteMethod;
import test.template.concrete.SecondStageConcreteMethod;

public class TestPrintGame {
	private AbstractChangeNumMethod method1;
	private AbstractChangeNumMethod method2;
	private LinkedHashMap<Integer,String> ruleMap;
	
	/*@org.junit.Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Before 
	public void setUp() {
		method1 = new FirstStageConcreteMethod();
		method2 = new SecondStageConcreteMethod();
		ruleMap = new LinkedHashMap<Integer,String>();
		ruleMap.put(3, "Fizz");
		ruleMap.put(5, "Buzz");
	}
	
	@Test
	public void addUser() {
		assertEquals("Buzz", method1.change(35, ruleMap));
		assertEquals("67", method1.change(67, ruleMap));
		assertEquals("Fizz", method1.change(33, ruleMap));
		assertEquals("FizzBuzz", method1.change(30, ruleMap));
		
		assertEquals("FizzBuzz", method2.change(35, ruleMap));
		assertEquals("67", method2.change(67, ruleMap));
		assertEquals("Fizz", method2.change(33, ruleMap));
		assertEquals("FizzBuzz", method2.change(30, ruleMap));
		assertEquals("Buzz", method2.change(56, ruleMap));
	}

}
