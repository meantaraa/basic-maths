import java.util.*;

public class CheckPalindrome {

    public static boolean checkPalindrome(int n){

        int revNum=0;
        int dup = n;

        while(n>0){
            int ld=n%10;

            revNum = revNum*10 + ld;
            n=n/10;
        }

        return dup==revNum;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();

        if(checkPalindrome(N)){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
}
}
// Time Complexity: O(log10N + 1) 
// Space Complexity: O(1)