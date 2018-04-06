//@author Vaibhav Mehandiratta
// 06/04/2018  v1.0
import java.util.Scanner;
public class Prob3{
    public static boolean Pal(String s)
    {   
        if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
        return Pal(s.substring(1, s.length()-1));
        return false;
    }

    public static void main(String[]args) 
    {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string :");
        String string = scanner.nextLine();
        if(Pal(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
       scanner.close();
}
}
