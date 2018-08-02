package learning.j8features;import java.util.Optional;

public class DefaultAndStaticMethodCheck implements InterfaceOne, InterfaceTwo {

	@Override
	public void interfaceTwoMethod() {
		// TODO Auto-generated method stub

	}

	@Override
	public void interfaceOneMethod(String str) {
		// TODO Auto-generated method stub

	}
	
	//DefaultAndStaticMethodCheck won't compile without having it's own log() implementation
	@Override
	public void log(String str) {
		System.out.println("MyClass logging::" + str);
		InterfaceOne.print("abc");		
	}

}
