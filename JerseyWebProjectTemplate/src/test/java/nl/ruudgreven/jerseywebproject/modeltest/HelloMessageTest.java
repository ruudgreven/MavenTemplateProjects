package nl.ruudgreven.jerseywebproject.modeltest;

import static org.junit.Assert.*;

import nl.ruudgreven.jerseywebproject.model.HelloMessage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloMessageTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		HelloMessage msg = new HelloMessage();
		msg.setUsername("Ruud Greven");
		assertEquals("Hello Ruud Greven", msg.getMessage());
		
		//This test intentionally failed
		assertTrue(false);
		
	}

}
