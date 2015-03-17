package test;
import org.junit.Assert;
import org.junit.Test;


public class testMyClass {

	@Test
	// Testing to make sure that ReturnTrue method returns true.
	public void assertTrue() {
		Assert.assertTrue(MyClass.ReturnTrue());
	}
	@Test
	public void assertEquals() {
		Assert.assertEquals(3, MyClass.AddTwoNumbers(1, 2));
	}
}