import java.util.*;

//          ---CODE TO FIND THE INDEX POSTION IN ARRAY LINEAR SEARCHING---    
public class searchalphabet{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size till to add:");
        int size = sc.nextInt();
        char alpha[] = new char[size];

        for (int i=0;i<size;i++){
            System.out.println("Enter the alphabet:");
            alpha[i] = sc.next().charAt(0);

        }
        System.out.println("Enter the element to find:");
        char x = sc.next().charAt(0);
        for (int i=0;i<alpha.length;i++){
            //  System.out.println(alpha[i]);
            if(alpha[i]==x){
                System.out.println(x+" Found at index: "+i);
            }

        }
    }
}


