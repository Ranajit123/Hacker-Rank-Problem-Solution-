import java.util.*;
public class AppleAndOrange {
  public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    int appleCount = 0;
    for(int i=0; i<apples.size(); i++){
      int appleDistance = apples.get(i)+a;
      if(appleDistance>=s && appleDistance<=t){
        appleCount++;
      }
    }
    System.out.println(appleCount);

    int orangeCount = 0;
    for(int i=0; i<oranges.size(); i++){
      int orangeDistance = oranges.get(i) + b;
      if(orangeDistance<=t && orangeDistance>=s){
        orangeCount++;
      }
    }
    System.out.println(orangeCount);
    

}
  public static void main(String[] args) {
    int a = 4;
    int s = 7;
    int t = 10;
    int b = 12;
    ArrayList<Integer> apples = new ArrayList<>();
    apples.add(2);
    apples.add(3);
    apples.add(-4);

    ArrayList<Integer> oranges = new ArrayList<>();
    oranges.add(3);
    oranges.add(-2);
    oranges.add(-4);

    countApplesAndOranges(s, t, a, b, apples, oranges);

  }
}
