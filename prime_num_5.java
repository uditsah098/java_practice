package oneday;

public class prime_num_5 {
	public static void main(String arg[]) {
		int num=28;
		int count=0;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime number");
		}
			
	}

}
