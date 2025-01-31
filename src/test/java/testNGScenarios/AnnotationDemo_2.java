package testNGScenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationDemo_2 {
	@Test(enabled = false)
	public void f() {
		System.out.println("@Test f");
	}

	@Test
	public void b() {
		System.out.println("@Test b");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@Test
	public void a() {
		System.out.println("@Test a ");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}

}
