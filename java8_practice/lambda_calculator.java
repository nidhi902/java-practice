package java8_practice;
interface calculator {
    int add(int a, int b);

    
}
public class lambda_calculator {
    public static void main(String[] args) {
        calculator obj=(a,b)->a+b;
        System.out.println(obj.add(6,8));


        calculator obj2=(a,b)->a-b;
        System.out.println(obj2.add(6,8));

        calculator obj3=(a,b)->a*b;
        System.out.println(obj3.add(6,8));

    }
}
