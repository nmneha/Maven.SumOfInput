import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int total = 1;
        System.out.println("Enter a number");
        n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            total = total + (i+1);
        }
        System.out.print("The total sum of all numbers added from 1 to " + n + " is: " + total);
    }




}
