import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr={187,64,133, 62, 49, 163, 50, 115, 42, 65 ,60 ,49 ,32 ,87 ,141, 142, 146, 159};
        for(int i:Leaders(arr)){
            System.out.println(i+" ");
        }

    }

    public static ArrayList<Integer> Leaders(int[] arr){
        int i=arr.length-1;
        int max=arr[i]-1;
        ArrayList<Integer> a=new ArrayList<>();
        while(i>=0){
            if(arr[i]>max){
                max=arr[i];
                a.add(max);
            }
            i--;
        }
        Collections.reverse(a);
        return a;
    }

}
