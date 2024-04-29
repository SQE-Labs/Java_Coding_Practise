import java.util.*;
public class Palindrome {
    public static void main(String args[])
    {
        String str="aba";
        String str_new="";
        char[] ch=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--)
        {
            str_new=str_new+ch[i];
        }
        if(str.equals(str_new))
        {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}
