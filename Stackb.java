// package OutOfComfortzone;
import java.util.*;

// public class Stackb {
//     public static void stockSpan(int stocks[],int span[]){
//         Stack<Integer> s = new Stack<>();
//         span[0]=1;
//         s.push(0);
//         for(int i=0;i<stocks.length;i++){
//             int currPrice = stocks[i];
//             while (!s.isEmpty()&&currPrice>stocks[s.peek()]) {
//                 s.pop();
//             }
//             if (s.isEmpty()) {
//                 span[i]=i+1;
//             } else{
//                 int prevHigh = s.peek();
//                 span[i]=i-prevHigh;
//             }
//             s.push(i);
//         }
//     }
//     public static void main(String[] args) {
//         int stocks[] = {100,80,60,70,60,85,100};
//         int span[] = new int[stocks.length];
//         stockSpan(stocks, span);
//         for (int i = 0; i < span.length; i++) {
//             System.out.println(span[i]+" ");
//         }
//     }
// }
//
/**
 * Stackb
 */
// public class Stackb {

//     public static void main(String[] args) {
//         int arr[] = {6,8,0,1,3};
//         Stack<Integer> s =new Stack<>();
//         int nxtGenerator[] = new int[arr.length];
//         for(int i=arr.length-1;i>=0;i--){
//             //While
//             while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
//                 s.pop();
//             }
//             //If-else
//             if (s.isEmpty()) {
//                 nxtGenerator[i]=-1;
//             } else{
//                 nxtGenerator[i]= arr[s.peek()];
//             }
//             //push idx in Stack
//             s.push(i);

//         }
//         for(int i=0;i<nxtGenerator.length;i++){
//             System.out.print(nxtGenerator[i]+" ");
//         }
//         System.out.println();
//     }
// }
/**
 * Stackb
 */
// public class Stackb {
//     public static boolean isValid(String str){
//         Stack<Character> s = new Stack<>();             

//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             if (ch=='[' || ch=='{' || ch=='(') {
//                 s.push(ch);
//             } else{
//                 if (s.isEmpty()) {
//                     return false;
//                 }
//                 if (s.peek()=='(' && ch==')' || s.peek()=='{' && ch=='}' ||s.peek()=='[' && ch==']') {
//                     s.pop();
//                 } else{
//                     return false;
//                 }
//             }
//         }
//         if (s.isEmpty()) {
//             return true;
//         } else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         String str = "([]){}";
//         System.out.println(isValid(str));
//     }
// }

public class Stackb {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dim=new int[n+1];

        for(int i=0;i<=n;i++){
            dim[i]=sc.nextInt();
        }

        int[][] dp=new int[n][n];
        for(int len=2;len<=n;len++){
            for(int i=0;i<=n-len;i++){
                int j=n-len+1;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int c=dp[i][k]+dp[k+1][j]+dim[i]*dim[k+1]*dim[j+1];
                    if (c<dp[i][j]) {
                        dp[i][j]=c;
                    }
                }
            }
        }
        System.out.println(dp[0][n-1]);
    }
}