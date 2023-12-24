package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maxWaterContainer {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,8};
        System.out.println(maxArea(arr));
        int[][] ar={{1,1,1},
                    {1,1,1}};
      //numSpecial(ar);
        for(int[] a:onesMinusZeros(ar)){
            System.out.println(Arrays.toString(a));
        }

    }

    public static int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int maxWater=0;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int water=h*(j-i);
            maxWater=Math.max(water,maxWater);

            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;
    }

    public static void numSpecial(int[][] mat) {
        int count=0;
        int m=mat.length,n=mat[0].length;
        int[] row=new int[m];
        int[] col=new int[n];

        //traversing through each element and checking if it is 1
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }

        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(col));
        //checking row and col arrays
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(mat[i][j]==0) continue;
//                if(row[i]==1 && col[j]==1){
//                    count++;
//                }
//            }
//        }
//        return count;
    }

    public static int[][] onesMinusZeros(int[][] grid) {

        int m=grid.length,n=grid[0].length;
        int[] row=new int[m];
        int[] col=new int[n];
        int[][] diff=new int[m][n];

        //traversing through each element and checking if it is 1
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                diff[i][j]=row[i]+col[j]-(n-row[i])-(m-col[j]);
            }
        }
        return diff;
    }
}
