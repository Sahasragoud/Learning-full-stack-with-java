import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements seperated by space: ");
        int n= sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Sum of ( " + n +" , "+m+" ) : "+ (n+m));
    }
}