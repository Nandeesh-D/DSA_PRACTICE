public class StringsAreEqual {
    public static void main(String[] args) {
        String[] word1={"a", "cb"};
        String[] word2={"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1,word2));
        System.out.println(')'+0);
        String a="leetcode";
        String b="code";
        System.out.println(strStr(a,b));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a="";
        String b="";
        for(String i:word1){
            a+=i;
        }
        for(String j: word2){
            b+=j;
        }
        return a.equals(b);
    }

    public static int strStr(String haystack, String needle) {
        int l=needle.length();
        for(int i=0;i<haystack.length();i++){
            if(haystack.substring(i,i+l).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
