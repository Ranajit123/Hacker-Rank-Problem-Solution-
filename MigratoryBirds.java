/*
Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.

Example:
array = [1, 1, 2, 2, 3]
There are two each of types 1 and 2,and one sighting of type 3. Pick the lower of the two types seen twice: type 1.
 */
import java.util.*;
public class MigratoryBirds {
  public static int maxMigratoryBirds(ArrayList<Integer> arr){
    int birdsType[] = new int[5];
    for(int i =0; i<arr.size(); i++){
      birdsType[arr.get(i)-1]++;
    }
    int max = 0, ans =0;
    for(int i=0; i<birdsType.length; i++){
      if(birdsType[i]>max){
        max = birdsType[i];
        ans = i+1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(1);
    arr.add(2);
    arr.add(3);
    System.out.println(maxMigratoryBirds(arr));
  }
}
