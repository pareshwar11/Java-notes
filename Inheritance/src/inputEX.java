import java.util.*;
public class inputEX {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//here Scanner is a class and Scanner.in define, now system is taking input from system.
		String name=sc.nextLine();
		//here i am used String type data you can use what you want to use.
		//nextLine() is used for string 
		//nextInt() is used for int number
		//nextFloat() is used for floating number.
 		System.out.println(name);
 		Scanner num=new Scanner(System.in);
 		int a=num.nextInt();
 		int b=num.nextInt();
 		int sum = a + b;
 		System.out.println(a+ "+" +b+ " sum is " +sum);
	}

}
