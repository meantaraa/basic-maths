// import java.util.*;

// public class CheckIfPrime {

//     static boolean checkPrime(int n) {

//         int cnt=0;

//         for(int i=1; i<=n; i++){

//             if(n%i == 0){

//                 cnt++;
//             }
//         }

//         return cnt == 2;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int number = sc.nextInt();

//         if(checkPrime(number)){
//             System.out.println(number+" is a prime number.");
//         }else{
//             System.out.println(number+" is not a prime number.");
//         }
//     }
    
// }
// Time Complexity: O(N) 
// Space Complexity : O(1) 

import java.sql.Time;
import java.util.*;

public class CheckIfPrime{

    public static boolean checkPrime(int n){

        int cnt=0;

        for(int i = 1; i<= Math.sqrt(n); i++){

            if(n%i == 0){
                cnt++;

                if(n/i != i){
                    cnt++;
                }
            }
        }

        return cnt == 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(checkPrime(number)){
            System.out.println(number+" is a prime number.");
        }else{
            System.out.println(number+" is not a prime number.");
        }
    }
}
// Time Complexity: O(sqrt(N))
// Space Complexity : O(1) 
