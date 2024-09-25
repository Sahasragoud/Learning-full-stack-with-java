import java.util.Scanner;
public class NoOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String low = text.toLowerCase();
        char[] vowels = {'a','e','i','o','u'};
        int count = 0;
        for(int i = 0;i < text.length(); i++){
            for(int j= 0;j < vowels.length;j++){
                if(low.charAt(i) == vowels[j]) count++; 
            }
        }
        System.out.println("No.of vowels in: "+text + "is: "+ count);
    }
}