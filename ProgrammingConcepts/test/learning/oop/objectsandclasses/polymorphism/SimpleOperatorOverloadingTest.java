package learning.oop.objectsandclasses.polymorphism;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleOperatorOverloadingTest {
	private static Logger LOG = LogManager
			.getLogger(SimpleOperatorOverloadingTest.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LOG.debug("--------------- Testing SimpleOperatorOverloading Started ---------------");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LOG.debug("--------------- Testing SimpleOperatorOverloading Started ---------------");
	}

	@Test
	public void testAddInteger() {
		SimpleOperatorOverloading simpleOperator = new SimpleOperatorOverloading();
		assertTrue(simpleOperator.addInteger(10, 10) == 20);

	}

	@Test
	public void testAddDouble() {
		SimpleOperatorOverloading simpleOperator = new SimpleOperatorOverloading();
		assertTrue(simpleOperator.addDouble(10.0001, 10.0001) == 20.0002);

	}
}
