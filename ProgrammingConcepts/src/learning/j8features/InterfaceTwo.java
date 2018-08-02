package learning.j8features;

@FunctionalInterface
public interface InterfaceTwo {

	void interfaceTwoMethod();
	
	default void log(String str){
		System.out.println("I2 logging::"+str);
	}

}
