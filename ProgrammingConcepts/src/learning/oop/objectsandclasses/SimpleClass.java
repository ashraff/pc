package learning.oop.objectsandclasses;

public class SimpleClass {

	private int integerVar = 1;

	private String stringVar = "SimpleClass";

	public int getIntegerVar() {
		return integerVar;
	}

	public void setIntegerVar(int integerVar) {
		this.integerVar = integerVar;
	}

	public String getStringVar() {
		return stringVar;
	}

	public void setStringVar(String stringVar) {
		this.stringVar = stringVar;
	}

	@Override
	public String toString() {
		return "integerVar = " + integerVar + ",stringVar = " + stringVar;
	}
}
