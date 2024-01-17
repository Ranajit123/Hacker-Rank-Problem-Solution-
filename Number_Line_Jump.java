/**
 * Number_Line_Jump
 * 
 * You are choreographing a circus show with various animals. For one act, you are given two         kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).

  The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
  The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
  You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.

  Constraints ->
  0<=x1<x2<=1000
  1<=v1<=10000
  1<=v1<=10000

  Sample input ->
  x1 = 0, v1 = 3, x2 = 4, v2 = 2

  Sample output ->
  YES

  Approch ->

  1. x1<x2(given in the question) so if  v2 >= v1 then the kangaroos never meet, cause already kangaroo2 start jumping at a certain distance if the speed of the kangaroo is high or equal kangaroo1 never meet kangaroo2.
  
  2. speed = distance/time,
     Here, time = jump, so, distance = speed * jump
     kangaroo start at a certain distance so start point will also included to the distance
     "distance = (speed * jump) + startinh position"
     for kangaroo1,
        total distance = (v1 * jump) + x1
     for kangaroo2,
        total distance = (v2 * jump) + x2
     the distace should be equal for fullfill their meeting condition
     so, (v1 * jump) + x1 = (v2 * jump) + x2
         (v1 * jump) - (v2 * jump) = x2 - x1
         jump(v1 - v2) = x2 - x1
         jump = (x2-x2)/(v1-v2)
     the value of jump should be 0 for their meet, if not then they will never meet
 */
public class Number_Line_Jump {
  static String kangaroo(int x1, int v1, int x2, int v2){
    if(v2>=v1){
      return "NO";
    }
    return (x2-x2)%(v1-v2) == 0? "YES":"NO";
  }
  public static void main(String[] args) {
    int x1 = 0;
    int v1 = 3;
    int x2 = 4;
    int v2 = 2;
    System.out.println(kangaroo(x1, v1, x2, v2));
  }
  
}
