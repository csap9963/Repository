package test.java;

import main.java.DoSomething;

import org.junit.Test;

public class JTest {
	@Test
	public void test() {
		String teststring = "Hau den hu t";
		String s = DoSomething.doSomething(teststring);
		System.out.println(s);
	    assert !s.contains(" ");
			
	}
}



