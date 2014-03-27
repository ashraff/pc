package learning.oop.objectsandclasses.abstraction;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleAbstractClassImplTest {

	private static Logger LOG = LogManager
			.getLogger(SimpleAbstractClassImplTest.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LOG.debug("--------------- Testing SimpleAbstractClassIntegerImpl Started ---------------");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LOG.debug("--------------- Testing SimpleAbstractClassIntegerImpl Completed ---------------");
	}

	@Test
	public void testComputeInteger() {
		SimpleAbstractClassIntegerImpl abstractImpl = new SimpleAbstractClassIntegerImpl();
		Integer computedResult = abstractImpl.computeSquare(10);
		LOG.debug("Square of 10 is :" + computedResult);
		assertEquals(computedResult, new Integer(100));
	}

}
