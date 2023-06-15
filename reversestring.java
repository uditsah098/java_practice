

public class reversestring {
	public static void main(String[] args) {
		String abc="APPLE";
		String out="";
		for(int i=abc.length()-1; i>=0;i--) { 
			out= out +abc.charAt(i);
			
		}
		System.out.println(out);
	}

}
