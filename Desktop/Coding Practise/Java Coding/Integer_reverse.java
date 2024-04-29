public class Integer_reverse {
    public static void main(String args[])
    {
        int number=12345678;
        String num_str="number";
        char[] ch=num_str.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            System.out.println(ch[i]);
        }
    }
}
