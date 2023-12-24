import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] a={{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};
        int n=a[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
            System.out.println(Arrays.toString(a[i]));
        }

    }
}
