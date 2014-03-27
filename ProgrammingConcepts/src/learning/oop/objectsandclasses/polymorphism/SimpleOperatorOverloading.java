package learning.oop.objectsandclasses.polymorphism;

/**
 * 
 * @author aw39997
 * 
 *         Operator overloading is not explicitly supported by Java,but it has
 *         several operators overloaded internally. Its not evident whether the
 *         operators are overloaded using OOPS concept;but they are examples of
 *         Operator Polymorphism.
 * 
 */
public class SimpleOperatorOverloading {

	public Integer addInteger(Integer leftOperand, Integer righOperand) {
		return leftOperand + righOperand;
	}

	public Double addDouble(Double leftOperand, Double righOperand) {
		return leftOperand + righOperand;
	}
}
