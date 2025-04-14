package OutOfComfortzone;

import java.util.Scanner;

// public class learn {
//     public static int gcd(int a,int b){
//         if (b==0) {
//             return a;
//         }
//         return gcd(b, a%b);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(gcd(a, b));

//     }
// }
/**
 * learn
 */
// public class learn {
//     public static long karatsubha(long x,long y){
//         if (x<10&&y<10) {
//             return x*y;
//         }
//         long l=Math.max(dig(x), dig(y));
//         long tenpow = (long) Math.pow(10, l);
//         long a,b,c,d;
//         a=x/tenpow;
//         b=x%tenpow;
//         c=y/tenpow;
//         d=y%tenpow;

//         long s1,s2,s4,ans;
//         s1=karatsubha(a, c);
//         s2=karatsubha(b, d);
//         s4=karatsubha(a+b, c+d)-s1-s2;
//         ans=(long)(s1*Math.pow(10, karatsubha(l, 2))+s2+s4*Math.pow(10, l));
//         return ans;
//     }
//     public static long dig(long n){
//         int cnt=0;
//         while (n!=0) {
//             cnt++;
//             n=n/10;
//         }
//         return (long)Math.ceil(cnt/2);
//     }

//     public static void main(String[] args) {  
//         Scanner sc= new Scanner(System.in);
//         long a  = sc.nextLong();
//         long b = sc.nextLong();
//         System.out.println(karatsubha(a, b));
//     }
// }
/**
 * learn
 */
// public class learn {
//     public static void seq(int a){
//         int crt=0;
//         int prev=0;
//         int maxL = 0;
//         while (a!=0) {
//             if ((a&1)==1) {
//                 crt++;
//             } else{
//                 prev=((a&2)==2) ? crt:0;
//                 crt=0;
//             }
//             maxL=Math.max(prev+crt, maxL);
//             a=a>>1;
//         }
//         System.out.println(maxL+1);
//     }

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int a =sc.nextInt();
//         seq(a);
//     }
// }
/**
 * learn
 */
// public class learn {

//     public static void main(String[] args) {
//         int n= Integer.valueOf(System.console().readLine());
//         int t= ((n&240)>>4) | ((n&15)<<4);
//         System.out.println(t);
//     }
// }
/**
 * learn
 */
// public class learn {
//     static int arr[];
//     public static void swap( int r, int first, int sec){
//         for(int i = 0 ; i < r ; i++){
//             int temp = arr[first + i]; 
//             arr[first + i] = arr[sec + i]; 
//             arr[sec + i] = temp;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         arr = new int[n];
//         for(int a=0;a<n;a++){
//             arr[a]=sc.nextInt();
//         }
//         int r = sc.nextInt();
//         int i=r;
//         int j=n-r;
//         if (r!=0 && r!=n) {
//             while (i!=j) {
//                 if (i<j) {
//                     swap(i, r-i, r+j-i);
//                     j=j-i;
//                 } else{
//                     swap(j, r-i, r);
//                     i=i-j;
//                 }
//             }
//             swap(i, r-i, r);
//         }
//         for(int k=0;k<n;k++){
//             System.out.print(arr[k]+" ");
//         }
        
//     }
// }
/**
 * learn
 */
// public class learn {

//     public static void main(String[] args) {
//         Scanner sc  = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int left=1, right=1,max=arr[0];
//         for(int i=0;i<n;i++){
//             left=left*arr[i];
//             right=right*arr[n-1-i];
//             max=Math.max(max, Math.max(left, right));
//             if (left==0) {
//                 left=1;
//             }
//             if (right==0) {
//                 right=1;
//             }
//         }
//         System.out.println(max);
//     }
// }
/**
 * learn
 */
// public class learn {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int pref=0,sum=0,max=Integer.MIN_VALUE;
//         boolean t = false;
//         for(int i=0;i<n;i++){
//             sum=sum+arr[i];
//         }
//         for(int i=0;i<n;i++){
//             sum=sum-arr[i];
//             if (pref==sum) {
//                 t=true;
//                 if (sum>=max) {
//                     max = sum;
                    
//                 }
//             }
//             pref=pref+arr[i];
//         }
//         // System.out.println(max);
//         if (t) {
//             System.out.println(max);
//         }else{
//             System.out.println("not found");
//         }
//     }
// }
/**
 * learn
 */
// public class learn {

//     public static void main(String args[]){
//         int arr[]= {16,17,4,3,5,2};
//         int n= arr.length;
//         int max=arr[n-1];
//         for(int i=n-1;i>=0;i--){
//             max=Math.max(max, arr[i]);
//             if (max==arr[i]) {
//                 System.out.print(max+"  ");
//             }
//         }
//     }
// }