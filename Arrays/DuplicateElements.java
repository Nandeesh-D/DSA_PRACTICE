import java.util.ArrayList;

public class DuplicateElements {
    public static void main(String[] args) {
        System.out.println(duplicates(new int[]{0,3,3,1,2},4));
    }

    public static ArrayList<Integer> duplicates(int[] arr,int n){
        int i=0;
        while(i<n){
            if(arr[i]==i){
                i++;
            }
            else{
                int t=arr[i];
                arr[i]=arr[t];
                arr[t]=t;
            }
        }

        ArrayList<Integer> ans=new ArrayList<>();
        for(int j=0;j<n;j++){
            if(j!=arr[j]){
                ans.add(arr[j]);
            }
        }
        if(ans.size()==0) ans.add(-1);
        return ans;
    }
}