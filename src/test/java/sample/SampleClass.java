package sample;

import org.testng.annotations.Test;

public class SampleClass {

	@Test
	public void TestingJenkinsExecution() {
		
		System.out.println("username is: " + ConfigFactorysample.getconfig().username() + " and password is: "
				+ ConfigFactorysample.getconfig().password());
	}
}
