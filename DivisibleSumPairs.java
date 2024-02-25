/*
 Given an array of integers and a positive integer k, determine the number of (i,j) pairs where i<j, and ar[i] + ar[j] is divisible by k.

 Returns
- int: the number of pairs
 */
import java.util.ArrayList;

public class DivisibleSumPairs {
  public static int divisiablePairs(ArrayList<Integer> arr, int k){
    int count = 0;
    for(int i =0; i<arr.size(); i++){
      int j = i+1;
      while(j<arr.size()){
        int sum = 0;
        sum += arr.get(i) + arr.get(j);
        if(sum%k == 0){
          count++;
        }
        j++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(4);
    arr.add(5);
    arr.add(6);
    int k = 5;
    System.out.println(divisiablePairs(arr, k));

  }
}
