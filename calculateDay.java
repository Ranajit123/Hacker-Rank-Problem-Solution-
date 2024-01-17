import java.io.*;
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    
    public static int findOddMonthsDay(int month, int day, int year){
        int totalDay = 0;
        if(month == 1){
            totalDay = 3 + day;
        }else if(month == 3){
            totalDay = 6 + day;
        }else if(month == 4){
            totalDay = 2 + day;
        }else if(month == 5){
            totalDay = 9 + day;
        }else if(month == 6){
            totalDay = 11 + day;
        }else if(month == 7){
            totalDay = 14 + day;
        }else if(month == 8){
            totalDay = 17 + day;
        }else if(month == 9){
            totalDay = 19 + day;
        }else if(month == 10){
            totalDay = 22 + day;
        }else if(month == 11){
            totalDay = 24 + day;
        }else if(month == 12){
            totalDay = 27 + day;
        }
        if(year%4 == 0 || year%400 == 0){
            totalDay++;
        }
        return totalDay%7;
    }
    public static String findDay(int month, int day, int year) {
        int newyear = year -1;
        
        int odd_month = newyear%400;
        int leap_year = (odd_month%100)/4;
        
        int odd_yearDays = ((odd_month%100)+leap_year)%7;
        
        if(odd_month/100 == 1){
          odd_yearDays += 5;
        }else if(odd_month/100 == 2){
          odd_yearDays += 3;
        }else if(odd_month/100 == 3){
          odd_yearDays += 1;
        }
        int odd_monthsDay = findOddMonthsDay(month, day, year);
        int odd_Days = (odd_monthsDay+odd_yearDays)%7;
        if(odd_Days == 0){
            return "SUNDAY";
        }else if(odd_Days == 1){
            return "MONDAY";
        }else if(odd_Days == 2){
            return "TUESDAY";
        }else if(odd_Days == 3){
            return "WEDNESDAY";
        }else if(odd_Days == 4){
            return "THURSDAY";
        }else if(odd_Days == 5){
            return "FRIDAY";
        }
        return "SATURDAY";
    }

}
public class calculateDay{
  public static void main(String[] args) throws IOException {
    System.out.println(Result.findDay(9, 28, 1987));
}
}