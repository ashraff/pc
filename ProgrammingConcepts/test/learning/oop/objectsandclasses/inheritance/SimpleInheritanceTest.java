package learning.oop.objectsandclasses.inheritance;

import static org.junit.Assert.*;

import learning.oop.objectsandclasses.inheritance.SimpleInheritance.Animal;
import learning.oop.objectsandclasses.inheritance.SimpleInheritance.Mammal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleInheritanceTest {

	private static Logger LOG = LogManager
			.getLogger(SimpleInheritanceTest.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LOG.debug("--------------- Testing SimpleInheritance Started ---------------");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LOG.debug("--------------- Testing SimpleInheritance Started ---------------");
	}

	@Test
	public void testInheritance() {
		SimpleInheritance simpleInheritance = new SimpleInheritance();
		assertTrue(simpleInheritance.getDog() instanceof Animal);
		assertTrue(simpleInheritance.getDog() instanceof Mammal);
		assertTrue(simpleInheritance.getMammal() instanceof Animal);

	}

}
