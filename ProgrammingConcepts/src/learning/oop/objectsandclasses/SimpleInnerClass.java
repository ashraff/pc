package learning.oop.objectsandclasses;

public class SimpleInnerClass {

	class InnerClass {
		int innerClassIntVar;
		String innerClassStringVar;

		public int getInnerClassIntVar() {
			return innerClassIntVar;
		}

		public void setInnerClassIntVar(int innerClassIntVar) {
			this.innerClassIntVar = innerClassIntVar;
		}

		public String getInnerClassStringVar() {
			return innerClassStringVar;
		}

		public void setInnerClassStringVar(String innerClassStringVar) {
			this.innerClassStringVar = innerClassStringVar;
		}

		@Override
		public String toString() {
			return "innerClassStringVar = " + innerClassStringVar
					+ ",innerClassIntVar = " + innerClassIntVar;
		}

	}

}
