import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
    int[] toBeReversed = new int[]{1,2,3,4,5};
    System.out.println(Arrays.toString(reverseArray(toBeReversed)));
  }
  public static int[] reverseArray (int[] arr){
    int arrayLength = arr.length;
    int[] revArray;
    revArray = new int[arrayLength];
    for (int i=0; i<arrayLength; i++){
      int newPosition = arrayLength - 1 - i;
      revArray[newPosition] = arr[i];
    }
    return revArray;
  }
}