package learning.oop.objectsandclasses.encapsulation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * 
 * @author aw39997
 *    Composition is has-a (*has-a*) relationship between two classes. It is
 *    always unidirectional. In the below example Car has a Engine and Car is disposed
 *    engine cannot exist.
 */
public class SimpleComposition {
	private static Logger LOG = LogManager.getLogger(Car.class);

	public static void main(String... args) {
		SimpleComposition simpleassociation = new SimpleComposition();
		Car car = simpleassociation.new Car();
		car.operate();
	}

	class Car {

		private Engine engine = new Engine();

		public void operate() {
			engine.start();
		}
	}

	class Engine {

		public void start() {
			/* Start Car */
			LOG.debug("Engine is Started");
		}
	}
}
