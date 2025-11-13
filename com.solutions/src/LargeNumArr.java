
class LargeNumArr {
    public int largestElement(int[] nums) {
        int largeNum = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largeNum){
                largeNum=nums[i];
            }
        }
        return largeNum;
    }
    public static void main(String[] args){
        System.out.println("Calling the largestElement method:");
        LargeNumArr newobj=new LargeNumArr();
        System.out.println(newobj.largestElement(new int[]{1,6,3,8,3} ));
        
    }

}