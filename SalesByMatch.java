/*
There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example:
n = 7
ar = [1, 2, 1, 2, 1, 3] 
There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.

Function Description:
Complete the sockMerchant function in the editor below.
sockMerchant has the following parameter(s):
  1. int n: the number of socks in the pile
  2. int ar[n]: the colors of each sock

Returns
int: the number of pairs
 */

import java.util.ArrayList;
import java.util.Collections;

public class SalesByMatch {
  public static int sockMerchant(ArrayList<Integer> ar, int n) {
    Collections.sort(ar);
    int res = 0;
    for(int i =0; i<ar.size(); i++){
      int count = 1;
      while(i+1<ar.size()){
        if(ar.get(i) == ar.get(i+1)){
          count++;
        }else{
          break;
        }
        i++;
      }
      res += count/2;
    }
    return res;
  }

  public static void main(String[] args) {
    ArrayList<Integer> ar = new ArrayList<>();
    ar.add(4);
    ar.add(5);
    ar.add(5);
    ar.add(5);
    ar.add(6);
    ar.add(6);
    ar.add(4);
    ar.add(1);
    ar.add(4);
    ar.add(4);
    ar.add(3);
    ar.add(6);
    ar.add(6);
    ar.add(3);
    ar.add(6);
    ar.add(1);
    ar.add(4);
    ar.add(5);
    ar.add(5);
    ar.add(5);
    int n = ar.size(); 
    
    System.out.println(sockMerchant(ar, n));

  }
}
