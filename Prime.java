import java.util.Scanner;
public class Prime{

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int i = 1;
    /*for (int i = 1; i <=n ; i++){
        if(n% i ==0) count++;
    }
    if (count <=2) System.out.println("Prime");
    else System.out.println("not prime");*/
    int c = checkPrime(n,i,count);
    if (c<=2) System.out.println("prime");
    else System.out.println("not prime");

  }
    public static int checkPrime(int n,int i,int count) {
        
        if (i<= n) {
        if (n% i == 0 ) count++;
        return checkPrime(n,i+1,count);
        }
        return count;
}}