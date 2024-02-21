/*
 Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
  Lily decides to share a contiguous segment of the bar selected such that:
    The length of the segment matches Ron's birth month, and,
    The sum of the integers on the squares is equal to his birth day.
  Determine how many ways she can divide the chocolate.
 */

import java.util.ArrayList;

public class subArrayDivision {
  public static int birthday(ArrayList<Integer> s, int d, int m){
    int pair = 0;
    for(int i = 0 ; i<s.size(); i++){
      int sum = 0;
      int j = i;
      while(j<i+m && j<s.size()){
        sum += s.get(i);
        j++;
      }
      if(sum == d){
        pair ++;
      }
    }
    return pair;
  }
  public static void main(String[] args) {
    ArrayList<Integer> s = new ArrayList<>();
    s.add(2);
    s.add(2);
    s.add(1);
    s.add(3);
    s.add(2);
    int d = 4, m = 2;
    System.out.println(birthday(s, d, m));

  }
}
