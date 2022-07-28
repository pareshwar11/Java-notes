package setCollection;

public class HashCodeSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashCodeSample s1=new HashCodeSample();
		System.out.println(s1.hashCode());
		
		// Hexa-decimal form of hashcode
		HashCodeSample s2=new HashCodeSample();
		System.out.printf("%x",s2.hashCode());
		
		HashCodeSample s3=new HashCodeSample();
		System.out.println("\n"+s3.hashCode());
		
		String str=new String("Guldu");
		System.out.println(str.hashCode());
	}

//	output:-
//	1072591677
//	5acf9800
//	140435067
//	69162543
}
