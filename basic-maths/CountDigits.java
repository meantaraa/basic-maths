// import java.util.Scanner;

// public class CountDigits{

//     public static int countDigits(int n){
//         int cnt=0;

//         while(n>0){
//             n=n/10;
//             cnt++;
//         }

//         return cnt;
//     }

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int N = sc.nextInt();

//         System.out.println("N: " + N);
//         int digits = countDigits(N);
//         System.out.println("Number of Digits in N: " + digits);
//     }
// }
// Time Complexity: O(log10N + 1)
// Space Complexity: O(1)

import java.util.*;

public class CountDigits{

    public static int countDigits(int n){

        int cnt=(int)(Math.log10(n)+1);
        return cnt;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();

        System.out.println("N: " + N);
        int digits = countDigits(N);
        System.out.println("Number of Digits in N: " + digits);
    }
}

// Time Complexity: O(1)
// Space Complexity : O(1)