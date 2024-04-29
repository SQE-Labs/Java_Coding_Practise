public class Overload {
    int sum(int a, int b) {
        return a + b;
    }
    double sum(double a,double b){
        return a+b;
    }
    public static void main(String args[]){
        Overload o=new Overload();
        System.out.println(o.sum(1,2));
        System.out.println(o.sum(1.5,2.0));
    }
}
