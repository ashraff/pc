package learning.oop.objectsandclasses.encapsulation;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class SimpleEncapsulationTest {
	private static Logger LOG = LogManager
			.getLogger(SimpleEncapsulationTest.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LOG.debug("--------------- Testing SimpleEncapsulation Started ---------------");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LOG.debug("--------------- Testing SimpleEncapsulation Completed ---------------");
	}


	@Test
	public void testEncapsulation() {
		SimpleEncapsulation encap = new SimpleEncapsulation();
     encap.setName("Ashraff");
     encap.setAge(20);
     encap.setIdNum("12343MS");
     LOG.debug(encap);
     assertEquals(20, encap.getAge());
	}

}
