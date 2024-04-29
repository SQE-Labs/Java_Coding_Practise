import java.util.HashMap;
import java.util.Map;

public class Duplicate_Character_With_Count {
    public static void main(String args[]){
        String str="SakshamSharma";
        char[] ch=str.toCharArray();
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(m.containsKey(ch[i]))
            {
               m.put(ch[i],m.get(ch[i])+1);
            }
            else {
                m.put(ch[i],1);
            }
        }
        for(Map.Entry<Character, Integer> m1:m.entrySet())
        {
//            System.out.println("all content in map"+m1);
            if(m1.getValue()!=1)
            System.out.println(m1);
        }
    }
}
