package java8_practice;
interface myfile {
    int sum(int a, int b);

    
}
public class lambdaexpression {
    
    public static void main(String[] args) {
        myfile obj=(a,b)->a+b;
        System.out.println(obj.sum(7,8));
    }
    
}
