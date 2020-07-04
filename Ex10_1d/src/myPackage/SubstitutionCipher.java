package myPackage;

public class SubstitutionCipher implements MessageEncoder {
	private int shift=0;
	
	public SubstitutionCipher(int shift){
		this.shift=shift;
	}
	
	public String encode(String plainText){
		char[] plainTxt=plainText.toCharArray();
		for(int i=0;i<plainTxt.length;i++){
			plainTxt[i]+=shift;
		}
		return String.valueOf(plainTxt);
	}
}
