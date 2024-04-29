import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_Char {
    public static void main(String args[])
    {
        String str="Saksham Sharma";
        char[] ch=str.toCharArray();
        Set<Character> s=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            s.add(ch[i]);
        }
        System.out.println(s);
    }
}
