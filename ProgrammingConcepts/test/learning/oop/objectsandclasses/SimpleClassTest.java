package learning.oop.objectsandclasses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleClassTest {

	private static Logger LOG = LogManager.getLogger(SimpleClassTest.class);

	@BeforeClass
	public static void setUp() throws Exception {
		LOG.debug("--------------- Testing SimpleClass Started ---------------");
	}

	@Test
	public void testNotNull() {
		SimpleClass simpleClass = new SimpleClass();
		LOG.debug(simpleClass.toString());
		assertNotNull("SimpleClass Exists : ", simpleClass);

	}

	@Test
	public void testIntegerVar() {
		SimpleClass simpleClass = new SimpleClass();
		simpleClass.setIntegerVar(100);
		simpleClass.setStringVar(null);
		LOG.debug(simpleClass.toString());
		assertEquals(100, simpleClass.getIntegerVar());
	}

	@Test
	public void testStringVar() {
		SimpleClass simpleClass = new SimpleClass();
		simpleClass.setIntegerVar(100);
		simpleClass.setStringVar("ASHRAFF");
		LOG.debug(simpleClass.toString());
		assertEquals("ASHRAFF", simpleClass.getStringVar());
	}

	@AfterClass
	public static void end() {
		LOG.debug("--------------- Testing SimpleClass Completed---------------");

	}
}
