
public class RemoveDupInArray {

    public static void main(String[] args) {
        int[] arr = { 0, 0, 3, 3, 5, 6 };
        System.out.println("Calling the removeDupInarray method:");
        RemoveDupInArray objExample = new RemoveDupInArray();

       System.out.println( objExample.removeDuparray(arr));
    }

    public int removeDuparray(int[] arr) {
        //using 2 pointers approach
        int i = 0; //this is starts with first element
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) { //compare current element with last unique element
                arr[i+1] = arr[j]; //if not equal, increment i and update the next position with current element
                i++;
            }
        }
        return i+1;
    }
}
