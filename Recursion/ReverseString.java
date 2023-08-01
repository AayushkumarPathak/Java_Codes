// Reverse of string
public class ReverseString {
    public static void reverse(String word, int idx){
        if(idx == 0){
            System.out.print(word.charAt(idx)+" ");
            return;
        }
        
        System.out.print(word.charAt(idx)+" ");
        reverse(word,idx-1);
    }
    public static void main(String[] args) {
        String word = "abcd";
        int idx = word.length()-1;
        reverse(word, idx);
        
    }
    
}
