
public class Fibo {
	void getFibo(int n) {
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2+ " ");
		for(int i=2;i<=n;i++) {
			int n3=n1+n2;
			System.out.print(n3+ " ");
			n2=n3;
			n1=n2;
		}
	}
	public static void main(String []args) {
		int n=5;
		Fibo f=new Fibo();
		f.getFibo(n);
	}

}
