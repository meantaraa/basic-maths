// import java.util.Scanner;

// public class FindGCDLCM {
    
//     public static int findGcd(int n1, int n2){

//         int gcd=1;

//         for(int i=1; i<=n1 && i<=n2; i++){
//             if(n1%i==0 && n2%i==0){
//                 gcd=i;
//             }
//         }
//         return gcd;
//     }

//     public static int findLcm(int n1, int n2){

//         int lcm = (n1*n2)/findGcd(n1, n2);
//         return lcm;
//     }

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers: ");
//         int N1 = sc.nextInt();
//         int N2 = sc.nextInt();

//         System.out.println("GCD of "+N1+" and "+N2+" is: "+findGcd(N1, N2));
//         System.out.println("LCM of "+N1+" and "+N2+" is: "+findLcm(N1, N2));
//     }
// }
// Time Complexity: O(min(N1, N2))
// Space Complexity: O(1)
import java.util.Scanner;

public class FindGCDLCM {

    public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {
            if(a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return (a == 0) ? b : a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int gcd = findGcd(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
        sc.close();
    }
}
