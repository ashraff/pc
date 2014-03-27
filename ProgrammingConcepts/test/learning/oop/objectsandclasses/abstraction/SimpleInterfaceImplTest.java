package learning.oop.objectsandclasses.abstraction;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleInterfaceImplTest {

	private static Logger LOG = LogManager
			.getLogger(SimpleInterfaceImplTest.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LOG.debug("--------------- Testing SimpleInterfaceImpl Started ---------------");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LOG.debug("--------------- Testing SimpleInterfaceImpl Completed ---------------");
	}


	@Test
	public void testInterface() {
		SimpleInterface interfaceImpl = new SimpleInterfaceImpl();
		interfaceImpl.printType();
		assertNotNull(interfaceImpl);
	}

}
