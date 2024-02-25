/*
Two friends Anna and Brian, are deciding how to split the bill at a dinner. Each will only pay for the items they consume. Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.

For example, assume the bill has the following prices: bill = [2, 4, 6]. Anna declines to eat item 
k = bill[2] which costs 6. If Brian calculates the bill correctly, Anna will pay (2+4)/2=3. If he includes the cost of bill[2], he will calculate (2+4+6)/2=6. In the second case, he should refund 3 to Anna.

Function Description

  Complete the bonAppetit function in the editor below. It should print Bon Appetit if the bill is fairly split. Otherwise, it should print the integer amount of money that Brian owes Anna.

  bonAppetit has the following parameter(s):

  1. bill: an array of integers representing the cost of each item ordered
  2. k: an integer representing the zero-based index of the item Anna doesn't eat
  3. b: the amount of money that Anna contributed to the bill
 */

import java.util.ArrayList;

public class BillDivision {
  public static void bonAppetit(ArrayList<Integer> bill, int k, int b){
    int totalbill = 0;
    for(int i=0; i<bill.size(); i++){
      if(i != k){
        totalbill += bill.get(i);
      }
    }
    int annaPay = totalbill/2;
    if(annaPay == b){
      System.out.println("Bon Appetit");
    }else{
      if(b>annaPay){
        System.out.println(b-annaPay);
      }else{
        System.out.println(annaPay-b);
      }
    }
  }
  public static void main(String[] args) {
    ArrayList<Integer> bill = new ArrayList<>();
    bill.add(3);
    bill.add(10);
    bill.add(2);
    bill.add(9);

    int k = 1;
    int b = 7;

    bonAppetit(bill, k, b);
  }
}
