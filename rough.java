// import java.util.*;  
public class rough {  

public static void main(String[] args) {  
    int arr[] = {2, 2, 1, 3, 2};
    for(int i = 0 ; i<arr.length; i++){
        int sum = 0;
        int j = i;
        while(j<i+2 && j<arr.length){
            sum += arr[j];
            j++;
        }
        System.out.println(sum);
    }

    
}  
}  
