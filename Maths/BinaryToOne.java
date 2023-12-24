public class BinaryToOne {
    public static void main(String[] args) {
        System.out.println(numSteps("1101"));
    }
    public static int numSteps(String s) {
            int carry=0;
            int steps=0;
            for(int i=s.length()-1;i>=1;i--){
                if((s.charAt(i)-'0')+carry==1){
                    carry=1;
                    steps+=2;
                }
                else{
                    steps++;
                }
            }
            return steps+carry;
    }
}
