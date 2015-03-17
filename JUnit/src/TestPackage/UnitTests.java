package TestPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import MainPackage.MyClass;

public class UnitTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void ut_ReturnTrue() {
		MyClass c = new MyClass();
		Boolean b = c.ReturnTrue();
		assertTrue("The method does not return true.", b);
	}
	
	@Test
	public void ut_AddTwoNumbers() {
		int nbr1 = 1;
		int nbr2 = 2;
		int nbr3 = 3;
		
		MyClass c = new MyClass();
		int i = c.AddTwoNumbers(nbr1, nbr2);
		assertEquals("The method does not correctly add two numbers.", i, nbr3);
	}

}
