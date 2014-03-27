package learning.oop.objectsandclasses.encapsulation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author aw39997
 * 
 *         Association is a (*a*) relationship between two classes. It allows
 *         one object instance to cause another to perform an action on its
 *         behalf. Association is the more general term that define the
 *         relationship between two classes.
 */
public class SimpleAssociation {

	private static Logger LOG = LogManager.getLogger(Car.class);

	public static void main(String... args) {
		SimpleAssociation simpleassociation = new SimpleAssociation();
		Driver driver = simpleassociation.new Driver();
		driver.driveCar();
	}

	private class Car {

		public void operate() {
			/* Operate Car */
			LOG.debug("Someone Operates Car");
		}
	}

	/**
	 * 
	 * @author aw39997
	 * 
	 *         Driver drives the Car.
	 */
	private class Driver {
		public void driveCar() {
			Car car = new Car();
			car.operate();
		}
	}
}