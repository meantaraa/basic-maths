// import java.util.*;

// public class PrintAllDivisors {
//     public static int[] printDivisors(int n, int[] size){

//         int[] divisors = new int[n];

//         int count=0;

//         for(int i=1; i<=n; i++){
//             if(n%i==0){
//                 divisors[count++] = i;
//             }
//         }

//         size[0] = count;
//         return divisors;
//     }

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int N = sc.nextInt();

//         int[] size = new int[1];

//         int[] divisors = printDivisors(N, size);

//         System.out.println("The divisors of the number are: ");
//         for(int i=0; i<size[0]; i++){
//             System.out.print(divisors[i]+" ");
//         }
//     }
// }

import java.util.*;

public class PrintAllDivisors {
    public static ArrayList<Integer> findDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrtN; ++i) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        ArrayList<Integer> divisors = findDivisors(number);

        System.out.print("Divisors of " + number + " are: ");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
    }
}
