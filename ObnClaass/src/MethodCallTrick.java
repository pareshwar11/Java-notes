//The main advantage of a static method is that we can call it without creating an object. 
//It can access static data members and also change the value of it. It is used to create an instance method.

public class MethodCallTrick {
	public static void main(String[] args)   
	{  
	int a = 19;  
	int b = 5;  
	//method calling  without creating the object
	int c = add(a, b);   //a and b are actual parameters  
	System.out.println("The sum of a and b is= " + c);  
	}  
	//user defined method  
	public static int add(int n1, int n2)   //n1 and n2 are formal parameters  
	{  
	int s;  
	s=n1+n2;  
	return s; //returning the sum  
	}  

}
