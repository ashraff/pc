package learning.oop.objectsandclasses;

import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleStaticNestedClassTest {

	private static Logger LOG = LogManager
			.getLogger(SimpleStaticNestedClassTest.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LOG.debug("--------------- Testing SimpleStaticNestedClass Started ---------------");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LOG.debug("--------------- Testing SimpleStaticNestedClass Completed ---------------");
	}

	@Test
	public void testNotNull() {
		SimpleStaticNestedClass.InnerClass innerClass = new SimpleStaticNestedClass.InnerClass();
		LOG.debug(innerClass.toString());
		assertNotNull("SimpleStaticNestedClass.InnerClass Exists : ",
				innerClass);
	}

}
