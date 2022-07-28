// WAP to print PRIME Number from 1 to n

import java.util.Scanner;
public class progG {
	static boolean isPrime(int n){
        //since 0 and 1 is not prime return false.
//        if(n==1||n==0)return false;
        //Run a loop from 2 to n-1
        for(int i=2; i<n; i++){
//        	for(int i=2; 2<2;i++) for i=2, condition is false that's 2 is printed 
//        	for(int i=3; 3<3;
          // if the number is divisible by i, then n is not a prime number.
              if(n%i==0)return false;
        }
        //otherwise, n is prime number.
        return true;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WAP to print PRIME Number from 1 to n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
                System.out.print(i + " ");
            }
		}
	}
}

//==================================
//
//2nd Method:
//	import java.util.Scanner;
//
//	public class prog8 {
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			Scanner scanner = new Scanner(System.in);
//		      int i =0;
//		      int num =0;
//		      //Empty String
//		      String  primeNumbers = "";
//		      System.out.println("Enter the value of n:");
//		      int n = scanner.nextInt();
//		      scanner.close();
//		      for (i = 1; i <= n; i++)  	   
//		      { 		 		  
//		         int counter=0; 		  
//		         for(num =i; num>=1; num--)
//		         {
//			    if(i%num==0)
//			    {
//				counter = counter + 1;
//			    }
//			 }
//			 if (counter ==2)
//			 {
//			    //Appended the Prime number to the String
//			    primeNumbers = primeNumbers + i + " ";
//			 }	
//		      }	
//		      System.out.println("Prime numbers from 1 to n are :");
//		      System.out.println(primeNumbers);
//
//		}
//	}

