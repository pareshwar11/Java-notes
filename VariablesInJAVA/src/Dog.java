
// Variable Shadowing/Clashing in Java.
// In class an Instance variable and Local Variable will be having a same name, 
// in this case Local variable dominates instance variable within the scope or method. This called Variable Shadowing.

public class Dog {
	int i=25; // Local variable
	void meth() {
		int i=420; // Instance variable
		// scope of i, is within this method.
		System.out.println(i); // 420
		System.out.println(this.i); // 25
	}
	void anotherMeth() {
		System.out.println(i);
		System.out.println(this.i);
	}

}
