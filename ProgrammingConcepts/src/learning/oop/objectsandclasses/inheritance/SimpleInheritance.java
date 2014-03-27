package learning.oop.objectsandclasses.inheritance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author aw39997
 * 
 *         Inheritance can be defined as the process where one object acquires
 *         the properties of another. With the use of inheritance the
 *         information is made manageable in a hierarchical order.
 * 
 *         When we talk about inheritance, the most commonly used keyword would
 *         be extends and implements. These words would determine whether one
 *         object IS-A type of another. By using these keywords we can make one
 *         object acquire the properties of another object.
 */
public class SimpleInheritance {

	private static Logger LOG = LogManager.getLogger(SimpleInheritance.class);

	private Mammal mammal = new Mammal();

	private Dog dog = new Dog();
	
	private Reptile reptile = new Reptile();

	public Mammal getMammal() {
		return mammal;
	}

	public void setMammal(Mammal mammal) {
		this.mammal = mammal;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Reptile getReptile() {
		return reptile;
	}

	public void setReptile(Reptile reptile) {
		this.reptile = reptile;
	}

	public static void main(String... args) {
		SimpleInheritance simpleInheritance = new SimpleInheritance();
		if (simpleInheritance.getDog() instanceof Animal)
			LOG.debug("Dog is a Animal");
		if (simpleInheritance.getDog() instanceof Mammal)
			LOG.debug("Dog is a Mammal");
		if (simpleInheritance.getMammal() instanceof Animal)
			LOG.debug("All Mammals are Animals");

	}

	interface Animal {
	}

	class Mammal implements Animal {
	}

	class Reptile implements Animal {
	}

	class Dog extends Mammal {
	}

}
