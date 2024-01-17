import java.util.*;
public class Maximizing_the_final_element {
  public static int getMaxValue(ArrayList<Integer> arr){
    Collections.sort(arr);

    if(arr.get(0) != 1){
      arr.set(0, 1);
    }

    for(int i=1; i<arr.size(); i++){
      if(arr.get(i)-arr.get(i-1)>1){
        arr.set(i, arr.get(i-1)+1);
      }
    }

    return arr.get(arr.size()-1);
    
  }
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(3 );
    arr.add(2);
    arr.add(3);
    arr.add(5);
    System.out.println(getMaxValue(arr));
  }
}
