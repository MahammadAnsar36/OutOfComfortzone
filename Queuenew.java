// import java.util.*;

// public class Queuenew {
//     public static void printNonrepesting(String str){
//         int[] freq=new int[26];
//         Queue<Character> q=new LinkedList<>();
//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             q.add(ch);
//             freq[ch-'a']++;

//             while (!q.isEmpty()&&freq[q.peek()-'a']>1) {
//                 q.remove();
//             }

//             if (q.isEmpty()) {
//                 System.out.print(-1+" ");
//             }
//             else{
//                 System.out.print(q.peek()+" ");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//       String str="aabbccxb"   ;
//       printNonrepesting(str);
//     }
// }
import java.util.*;

public class Queuenew {
    public static int storeWater(ArrayList<Integer> height){
        int max=0;
        int l=0;
        int r=height.size()-1;
        while (l<r) {
            int ht=Math.min(height.get(l), height.get(r));
            int wid=r-l;
            int curr=ht*wid;
            max=Math.max(max, curr);
            if (height.get(l)<height.get(r)) {
                l++;

            } else{
                r--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(3);
        arr.add(4);
        arr.add(7);
        arr.add(4);
        arr.add(2);
        System.out.println(storeWater(arr));
    }
}