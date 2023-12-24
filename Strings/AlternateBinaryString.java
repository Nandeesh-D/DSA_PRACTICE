package Strings;
//problem: 1758
public class AlternateBinaryString {
    public static void main(String[] args) {
        String s="10010100";
        System.out.println(minOperations(s));
    }
    public static int minOperations(String s) {
        int c=0;    //to store min operations count of string starts with 1

        for(int i=0;i<s.length();i++){
            if(i%2==1){
                if(s.charAt(i)!='0'){
                    c++;
                }
            }
            else{
                if(s.charAt(i)!='1'){
                    c++;
                }
            }
        }
        //Generally min operations to make the alternative string to string in 1st statement are s.length -c
        //So,our answer is min in both of them.
        return Math.min(c,s.length()-c);
    }
}
