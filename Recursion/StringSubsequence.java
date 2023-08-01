public class StringSubsequence {
    public static void subsequence(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);

        // to be
        subsequence(str, idx+1, newStr+currChar);

        //or not to be
        subsequence(str, idx+1, newStr);
    }
public static void main(String[] args) {
    String str = "abc";
    int idx = 0;
    String newStr = "";

    subsequence(str, idx, newStr);
}
    
}
