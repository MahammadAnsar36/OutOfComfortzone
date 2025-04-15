// package OutOfComfortzone;
import java.util.*;
public class Stsa {
    public static void main(String args[]){
        int arr[]= {1,2,1,3,1,1,2,1} , count=0,idx=0,max=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            map.put(arr[i], 0);
        }

        for(int i=0;i<arr.length;i++){
            count=map.get(arr[i])+1;
            map.put(arr[i], count);
            max= Math.max(max, count);
            if (max==count) {
                idx=i;
            }
        }
        if (max>arr.length/2) {
            System.out.println(arr[idx]+" Count "+map.get(arr[idx]));
        }
    }
}
