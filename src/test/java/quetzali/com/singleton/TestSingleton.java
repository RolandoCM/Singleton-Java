package quetzali.com.singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestSingleton {
	//test fallara
	@Test
	public void testFail() {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		assertNotEquals(singleton, singleton2);
	}
	//test exitoso
	@Test
	public void test() {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println("Instancia 1: "+ System.identityHashCode(singleton));
		System.out.println("Instancia 2: "+ System.identityHashCode(singleton2));
		assertEquals(singleton, singleton2);
	}
	
}
