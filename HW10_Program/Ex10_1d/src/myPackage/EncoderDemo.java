package myPackage;

public class EncoderDemo {
	public static void main(String[] args){
		SubstitutionCipher c1 = new SubstitutionCipher(3);
		System.out.println("c1(hello)(shift: 3)" + c1.encode("hello"));
		SubstitutionCipher c2 = new SubstitutionCipher(5);
		System.out.println("c2(house)(shift: 5)" + c2.encode("house"));
		ShuffleCipher c3 = new ShuffleCipher(3);
		System.out.println("c3(hello)(shuffle: 3)" + c3.encode("hello"));
		ShuffleCipher c4 = new ShuffleCipher(5);
		System.out.println("c4(house)(shuffle: 5)" + c4.encode("house"));	
	}
}
