public class LCMandHCF {

  public static int GCD(int n1, int n2){
    // if(n2 == 0){
    //   return n1;
    // }
    return n2 == 0? n1:GCD(n2, n1%n2);
  }

  public static int LCM(int n1, int n2){
    // int lcm = (n1>n2) ? n1:n2;
    // while(true){
    //   if(lcm%n1 == 0 && lcm%n2 == 0){
    //     break;
    //   }
    //   ++lcm;
    // }

    // int lcm = 0, gcd = 1;
    // for(int i=1; i<= n1 && i<= n2; i++){
    //   if(n1%i == 0 && n2%i == 0){
    //     gcd = i;
    //   }
    //   lcm = (n1*n2)/gcd;
    // }
    return (n1*n2)/GCD(n1, n2);
  }
  public static void main(String[] args) {
    int N1 = 120;
    int N2 = 72;
    System.out.println("LCM: "+ LCM(N1, N2));
    System.out.println("GCD: "+GCD(N1, N2));

  }
}
