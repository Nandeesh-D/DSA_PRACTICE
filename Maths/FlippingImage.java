import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] a={{1,1,0}};
        int[][] b=flipAndInvertImage(a);
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(b[i]));
        }

    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row:image){
            int l= row.length;
            for(int j=0;j<(l+1)/2;j++){
                int temp=row[j]^1;
                row[j]=row[l-j-1]^1;
                row[l-j-1]=temp;
            }
        }
        return image;
    }
}
