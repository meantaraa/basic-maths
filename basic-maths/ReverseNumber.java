import java.util.*;

public class ReverseNumber{

    public static int reverseNumber(int n){

        int revNum=0;

        while(n>0){
            int ld = n%10;

            revNum = revNum*10 + ld;
            n=n/10;
        }

        return revNum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();

        System.out.println("N: " + N);
        int revNum = reverseNumber(N);
        System.out.println("Reverse of N: " + revNum);
    }
}
