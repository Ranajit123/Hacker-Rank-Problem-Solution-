public class CountingValleys {
  public static int countValleys(int steps, String path){
    int valleys = 0;
    int G = 0;
    for(int i =0; i<steps; i++){
      char ch = path.charAt(i);
      if(ch == 'D'){
        G -= 1;
      }else{
        G += 1;
      }

      if(G == 0 && ch == 'U'){
        valleys++;
      }
    }
    return valleys;
  }
  public static void main(String[] args) {
    int steps = 8;
    String path = "UDDDUDUU";

    System.out.println(countValleys(steps, path));
  }
}
