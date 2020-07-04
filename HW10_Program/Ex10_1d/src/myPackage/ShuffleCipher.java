package myPackage;

public class ShuffleCipher {
	private int n;
	
	public ShuffleCipher(int n){
		this.n=n;
	}
	
	public String encode(String plainText){
		String txt = plainText;
		for(int i=0;i<n;i++)
			txt=shuffle(txt);
		return txt;
	}
	
	private String shuffle(String txt){
		char[] text = txt.toCharArray();
		char[] toArray = new char[text.length];
		int point=(text.length+1)/2;
		int j=0;
		for(int i=0;i<point;i++){
			toArray[j++]=text[i];
			if((i+point)<text.length)
				toArray[j++]=text[i+point];
			else
				break;
		}
		return String.valueOf(toArray);
	}
}
