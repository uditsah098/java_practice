package oneday;

public class palindrome_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0,temp1=0;
        
        int x=1214;
        int xx=x;
        while(x!=0){
            temp1=x%10;
            x=x/10;
            temp=temp*10+temp1;
        }
        if(xx==temp)
        	System.out.println(true);
        else
        	System.out.println(false);

	}

}
