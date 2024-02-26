
public class ElectronicsShop {
  public static int getMoneySpent(int[] keyboards, int[] USB, int b){
    
    int spentAmount = 0;
    for(int i = 0; i<keyboards.length; i++){
      for(int j = 0; j<USB.length; j++){
        int amount = keyboards[i]+USB[j];
        if(amount < b){
          spentAmount = Math.max(amount, spentAmount);
        }
      }
    }
    return spentAmount>0? spentAmount:-1;
  }
  public static void main(String[] args) {
    int keyboards[] ={40, 50, 60};
    int USB[] = {5, 8, 12};
    int b = 6;

    System.out.println(getMoneySpent(keyboards, USB, b));
  }
}
