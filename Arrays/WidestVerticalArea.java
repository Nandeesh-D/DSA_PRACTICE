package Arrays;

import java.util.Arrays;

//problem: 1637
public class WidestVerticalArea {
    public static void main(String[] args) {
        int[][] a={{8,7},{9,9},{7,4},{9,7}};
        System.out.println(maxWidthOfVerticalArea(a));
    }


    //WidestVerticalArea is the one with maximum width between the 2 points.
    //We need to focus on x_coordinates only.
    //we have to return maximum width between the x_coordinates of 2 points.
    public static int maxWidthOfVerticalArea(int[][] points) {
            int n=points.length;
            int maxWidth=Integer.MIN_VALUE;  //to store maxwidth
            int[] x_values=new int[n];       //to store x_coordinates of points
            for(int i=0;i<n;i++){
                x_values[i]=points[i][0];
            }
            Arrays.sort(x_values);
            for(int i=1;i<n;i++){      //checking the diff between current and previous x_value
                if((x_values[i]-x_values[i-1])>maxWidth){
                    maxWidth=x_values[i]-x_values[i-1];
                }
                }
            return maxWidth;

    }
}
