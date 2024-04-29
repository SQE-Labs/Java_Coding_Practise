import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateCharacterRemoval {
    public static void main(String args[]){
        String str="Saksham";
        LinkedHashSet<Integer> setObj=new LinkedHashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you wanted to put in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the "+i+" element in Array");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            setObj.add(arr[i]);
        }
        System.out.println(setObj);
    }
}
