import java.util.*;

public class ArmstrongNumber {
    public static boolean isArmStrong(int num){

        int k = String.valueOf(num).length();

        int sum = 0;

        int n = num;

        while(n>0){
            int ld=n%10;

            sum += Math.pow(ld, k);

            n=n/10;
        }

        return sum==num;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();

        if(isArmStrong(N)){
            System.out.println("The number is an Armstrong number");
        }
        else{
            System.out.println("The number is not an Armstrong number");
        }
    }

}

// Time Complexity: O(log10N + 1) 
// Space Complexity: O(1)