
public class SecondLargestArr {

public static void main(String[] args){
    System.out.println("Calling the method");
    SecondLargestArr objExample=new SecondLargestArr();
    System.out.println( objExample.largestElement(new int[]{8, 8, 7, 6, 5} ));
}
    public int largestElement(int[] nums) {
        int largeNum = nums[0];
        int SlargeNum = -1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>largeNum){
                largeNum=nums[i];
            }else if(nums[i]<largeNum && nums[i]>SlargeNum){
                SlargeNum = nums[i];
            }
        }
        return SlargeNum;
    }
    
}
