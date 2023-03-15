package firstTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testFactorial {

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		calc= new Calculator;
		System.out.println("before executing all the test cases");
	}	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("After executing all the test cases");
	}
	@Before
	public void setUp() throws Exception{
		System.out.println("Before executing");
	}
	@After
	public void tearDown() throws Exception{
		System.out.println("After executing");
	}
	public void factorial() {
		
		
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
