package oneday;
class abc{
	int ab=0;
	int cb=1;
	int dc=0;
	public void fun1(int a) {
		if(a!=0) {

		dc=ab+cb;
		ab=cb;
		cb=dc;
		
		System.out.print(dc+" ");
		fun1(a-1);
	}
	}
}

public class fibonacci_series {
	
	
	public static void main(String[] arg) {
		int a=5;
		abc obj1=new abc();
		obj1.fun1(a);
	}

}
