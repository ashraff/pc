package learning.oop.objectsandclasses;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleAnonymousInnerClassTest {

	private static Logger LOG = LogManager
			.getLogger(SimpleAnonymousInnerClassTest.class);

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LOG.debug("--------------- Testing SimpleAnonymousInnerClass Started ---------------");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LOG.debug("--------------- Testing SimpleAnonymousInnerClass Started ---------------");
	}

	@Test
	public void testNotZero() {
		SimpleAnonymousInnerClass anonymousInnerClass = new SimpleAnonymousInnerClass();
		LOG.debug(anonymousInnerClass.toString());
		assertTrue(anonymousInnerClass.getMap().size()>0);
	}
	
	@Test
	public void testNotEquals() {
		SimpleAnonymousInnerClass anonymousInnerClass = new SimpleAnonymousInnerClass();
		Map<String, String> map = new HashMap<String, String>();
		LOG.debug(anonymousInnerClass.getMap().getClass() + ":" + map.getClass());
		assertNotEquals(anonymousInnerClass.getClass(),map.getClass());
	}

}
