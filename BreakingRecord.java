import java.util.ArrayList;

public class BreakingRecord {
  public static ArrayList<Integer> breakingrecords(ArrayList<Integer> scores){
    int minCount = 0;
    int maxCount = 0;
    int min = scores.get(0);
    int max = scores.get(0);
    for(int i = 1; i<scores.size(); i++){
      if(min>scores.get(i)){
        min = scores.get(i);
        minCount++;
      }else if (max < scores.get(i)) {
        max = scores.get(i);
        maxCount++;
      }
    }

    ArrayList<Integer> res = new ArrayList<>();
    res.add(maxCount);
    res.add(minCount);
    return res;
  }
  public static void main(String[] args) {
    ArrayList<Integer>scores = new ArrayList<>();
    scores.add(10);
    scores.add(5);
    scores.add(20);
    scores.add(20);
    scores.add(4);
    scores.add(5);
    scores.add(2);
    scores.add(25);
    scores.add(1);
    ArrayList<Integer> ans = new ArrayList<>();
    ans = breakingrecords(scores);
    while(!ans.isEmpty()){
      System.out.print(ans.get(0)+" ");
      ans.remove(0);
    }
  }
}
