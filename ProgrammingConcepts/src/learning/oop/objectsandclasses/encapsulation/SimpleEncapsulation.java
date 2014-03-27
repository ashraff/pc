package learning.oop.objectsandclasses.encapsulation;

/**
 * 
 * @author aw39997
 * 
 *         Encapsulation is the technique of making the fields in a class
 *         private and providing access to the fields via public methods. If a
 *         field is declared private, it cannot be accessed by anyone outside
 *         the class, thereby hiding the fields within the class. For this
 *         reason, encapsulation is also referred to as data hiding.
 * 
 *         Encapsulation can be described as a protective barrier that prevents
 *         the code and data being randomly accessed by other code defined
 *         outside the class. Access to the data and code is tightly controlled
 *         by an interface.
 * 
 *         The main benefit of encapsulation is the ability to modify our
 *         implemented code without breaking the code of others who use our
 *         code. With this feature Encapsulation gives maintainability,
 *         flexibility and extensibility to our code.
 */

public class SimpleEncapsulation {

	private String name;
	private String idNum;
	private int age;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setIdNum(String newId) {
		idNum = newId;
	}

	@Override
	public String toString() {
		return "name = " + name + ",idNum = " + idNum + ",age = " + age;
	}

}
