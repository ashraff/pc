package learning.oop.objectsandclasses.encapsulation;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author aw39997 Aggregation is the (*the*) relationship between two classes.
 *         When object of one class has an (*has*) object of another, if second
 *         is a part of first (containment relationship) then we called that
 *         there is an aggregation between two classes. Unlike association,
 *         aggregation always insists a direction.
 * 
 *         If the Plant is disposed ,Car as whole can still exist.
 * 
 */

public class SimpleAggregation {

	private static Logger LOG = LogManager.getLogger(SimpleAggregation.class);

	public static void main(String... args) {
		SimpleAggregation aggregation = new SimpleAggregation();
		Plant plant = aggregation.new Plant();
		Car car = aggregation.new Car();
		plant.addCar(car);
	}

	class Plant {
		List<Car> cars = new ArrayList<Car>();

		public void addCar(Car car) {
			cars.add(car);
		}

		public void removeCar(Car car) {
			cars.remove(car);
		}

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
