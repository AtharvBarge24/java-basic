import java.util.Scanner;

public class Year {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
    int y;
        System.out.println("Enter your fav year:  ");
        y= sc.nextInt();

        if(y%100==0   &&  y%400==0 ||
           y%100!=0   &&  y%4==0)
        {
            System.out.println("year is leap");

        }
        else
        {
            System.out.println("year is not leap");
        }
    }
}
