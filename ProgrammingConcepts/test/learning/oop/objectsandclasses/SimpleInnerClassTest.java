package learning.oop.objectsandclasses;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleInnerClassTest {

	private static Logger LOG = LogManager
			.getLogger(SimpleInnerClassTest.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LOG.debug("--------------- Testing SimpleInnerClass Started ---------------");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LOG.debug("--------------- Testing SimpleInnerClass Completed ---------------");
	}

	@Test
	public void testNotNull() {
		SimpleInnerClass simpleInnerClass = new SimpleInnerClass();
		SimpleInnerClass.InnerClass innerClass = simpleInnerClass.new InnerClass();
		LOG.debug(innerClass.toString());
		assertNotNull("SimpleInnerClass.InnerClass Exists : ", innerClass);
	}

}
