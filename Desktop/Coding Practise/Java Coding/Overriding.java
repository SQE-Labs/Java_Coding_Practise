import java.lang.*;
class Overriding {
    int sum(int a,int b)
    {
        System.out.println("Parent Sum Method");
        return a+b;
    }
}
class Child extends Overriding{
    int sum(int a,int b)
    {
        System.out.println("Child Sum Method");
        return a+b;
    }
    public static void main(String args[])
    {
        Child c=new Child();
        Overriding o=new Overriding();
        System.out.println(o.sum(1,2));
//        Child c= (Child) new Overriding();
        System.out.println(c.sum(1,2));
    }
}
