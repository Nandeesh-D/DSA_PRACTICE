package Strings;
//problem:242

public class ValidAnagram {
    public static void main(String[] args) {
        String s="ab";
        String t="a";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        //array to match elements in t and s with marking 1 for existed element
       int[] hash=new int[s.length()];
       
       if(s.length()>t.length()) return false;
       //matching elements in t with s
       for(int i=0;i<t.length();i++){
           boolean b=false;  // if element not in s so it is not an anagram
           for(int j=0;j<s.length();j++) {
               if (hash[j] == 0 && s.charAt(i) == t.charAt(j)) {
                   hash[j] = 1;
                   b=true;
                   break;
               }
           }
           //after this entire loop if a char doesn't found , we can return false
           if(!b) return false;
       }
       return  true;
    }
}
