package oneday;

public class remove_element {

	public static void main(String args[]) {
	int nums[]= {1,2,2,2,3,4,4,4,5};
	int val=2;
	int count=0;
	
	for(int i=0;i<nums.length;i++) {
		if(nums[count]!=nums[i]) {
			nums[count+1]=nums[i];
			count++;
			
		}
	}
	for(int j=0;j<=count;j++) {
		System.out.println(nums[j]);}
}
}

