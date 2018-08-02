package learning.j8features;

@FunctionalInterface
public interface InterfaceOne {

	void interfaceOneMethod(String str);

	default void log(String str) {
		System.out.println("I1 logging::" + str);
	}

	static void print(String str) {
		System.out.println("Printing " + str);
	}
}