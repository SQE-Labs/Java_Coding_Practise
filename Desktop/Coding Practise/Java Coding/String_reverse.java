public class String_reverse {
    public static void main(String args[]){
        String str="Saksham";
        char[] ch=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            System.out.println(ch[i]);
        }
    }
}
