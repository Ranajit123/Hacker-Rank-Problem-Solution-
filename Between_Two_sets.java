/**
 * Between_Two_sets
 */
import java.util.*;
public class Between_Two_sets {
  public static int getTotalSets(ArrayList<Integer> a, ArrayList<Integer> b){
    int result = 0;

    int lcm = getLCM(a);
    int gcd = getGCD(b);

    int multiple = 0;
    while(multiple <= gcd){
      multiple += lcm;
      if(gcd%multiple == 0){
        result ++;
      }
    }
    return result;
  }

  public static int GCD(int n1, int n2){
    return n2 == 0? n1 : GCD(n2, n1%n2);
  }

  public static int LCM(int n1, int n2){
    return (n1*n2)/GCD(n1, n2);
  }
  public static int getLCM(ArrayList<Integer> a){
    int lcm = a.get(0);
    for(int i =1; i<a.size(); i++){
      lcm = LCM(lcm, a.get(i));
    }
    return lcm;
  }

  public static int getGCD (ArrayList<Integer> a){
    int gcd = a.get(0);
    for(int i =1; i<a.size(); i++){
      gcd = GCD(gcd, a.get(i));
    }
    return gcd;
  }

  public static void main(String[] args) {
    // Initialize the arraylists
    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b = new ArrayList<>();
    
    // add value in a arraylist 
    a.add(2);
    a.add(4);

    // add value in b arraylist
    b.add(16);
    b.add(32);
    b.add(96);

    System.out.println(getTotalSets(a, b));
  }
}
