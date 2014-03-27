package learning.oop.objectsandclasses.abstraction;

public class SimpleAbstractClassIntegerImpl extends SimpleAbstractClass<Integer> {

	@Override
	Integer computeSquare(Integer arg) {
		return arg * arg;
	}

}
