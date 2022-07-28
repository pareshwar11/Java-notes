import java.util.Scanner;

public class WhileLoops {
 public static void main(String []args) {
	 int i=5;
	  do {
		  System.out.println(i+ " ");
		  i--;
	  }while(i>0);
	  
	  
	  // For integer
	 Scanner sc=new Scanner(System.in);
	 System.out.println();
	 System.out.println("Enter the input");
	 int n=sc.nextInt();
	 switch(n) {
	 case 1:
		 System.out.println("Your luck");
		 break;
	 case 2:
		 System.out.println("No more talk about Luck now");
		 break;
		 default:
			 System.out.println("RCB RCB");
			 break;
	 }
	 
	 
	 // For String
	 Scanner days=new Scanner(System.in);
	 System.out.println();
	 System.out.println("Enter the input");
	 String str=days.next();
	 switch(str) {
	 case ("monday"):
		 System.out.println("Goto college");
		 break;
	 case ("Tuesday"):
		 System.out.println("Goto Library");
		 break;
		 default:
			 System.out.println("RCB RCB");
			 break;
	 }
	 
 }
}
