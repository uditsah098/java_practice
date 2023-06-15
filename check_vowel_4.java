

public class check_vowel_4 {
	public static void main(String args[]) {
		String vowel="aeiou";
		String check="banianao";
		String vowelout="";
		int count=0;
		for(int i=0;i<check.length();i++) {
			for(int j=0;j<vowel.length();j++) {
				if(check.charAt(i)==vowel.charAt(j)) {
					vowelout=vowelout+vowel.charAt(j);
					count++;
				}
			}
		}
		System.out.println(vowelout+"  "+count);
	}

}
