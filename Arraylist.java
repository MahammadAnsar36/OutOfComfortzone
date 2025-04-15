// package OutOfComfortzone;
// import java.util.*;

// public class Arraylist {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number:-");
//         int n=sc.nextInt();
        
//         if (n<0 || n>999) {
//             System.out.println("Out of Range");
//         } else{
//             int f=n%10;
//             int a=n/10;
//             int s=a%10;
//             int h=n/100;
//             String uu[]={" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
//             String tt[]={" ","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty",};
//             String hh="Hundred";
//             if (n<20) {
//                 System.out.println(uu[n]);
//             }
//             else if (n<100) {
//                 System.out.println(tt[s]+uu[f]);
//             }
//             else{
//                 System.out.println(uu[h]+hh+tt[s]+uu[f]);
//             }
//         }

//         // String color[]={"Red","blue","green"};
//         // List list = Arrays.asList(color);
//         // System.out.println(list);
//         // Scanner sc = new Scanner(System.in);
//         // List<Integer> list=new ArrayList<>();
//         // System.out.println("Enter the sixe:");
//         // int size=sc.nextInt();
//         // for (int i = 0; i < size; i++) {
//         //     list.add(sc.nextInt());
//         // }
//         // System.out.println(list);
        


//     }
// }

// package OutOfComfortzone;
// import java.util.*;
// public class Arraylist {
//     public static boolean isPal(int x){
//         if (x<0) {
//             return false;
//         }

//         int n = x;
//         int revNum = 0;
//         int d=0;
//         while (n>0) {
//             d=n%10;
//             revNum=revNum*10+d;
//             n=n/10;
//         }
//         if (revNum==x) {
//             return true;
//         } else{
//             return false;

//         }
//     }
//     public static void main(String[] args) {
//         int x = 100;
//         // isPal(x);
//         System.out.println(isPal(x));
//     }
// }
// package OutOfComfortzone;