
public class ArraySorted {
    public static void main(String[] args)
    {
        System.out.println("Calling the sort method:");
        ArraySorted objExample=new ArraySorted();
        int[] arr={5,3,8,6,2};
        System.out.println(objExample.sort(arr));

    }
    public boolean sort(int[] arr){
        for(int i=1; i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
            }else{
                return false;
            }
        }
        return true;
    }
}
