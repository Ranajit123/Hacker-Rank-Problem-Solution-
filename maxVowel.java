public class maxVowel {
  public static void findSubstring(String s, int k) {
    // Write your code here
    String str = s.substring(0,k);
    int count1 = 0;
    for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count1++;
        }
    }
    int i =1;
    while(i+k <= s.length()){
        String newStr = s.substring(i, i+k);
        int count2 = 0;
        for(int j=0; j<newStr.length(); j++){
          char ch = newStr.charAt(j);
          if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count2++;
          }
        }
        System.out.println(i +" : " + count2);
        if(count2>count1){
            str = newStr;
            count1 = count2;
        }
        i++;
    }
    System.out.println(str);
    // return str;
    }
  public static void main(String[] args) {
    String str = "azerdii";
    int k=5;
    // System.out.println(findSubstring(str, k));
    findSubstring(str, k);
  }
}
