import java.util.Scanner;

class fiboiteration{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int a=1,b=0;
         System.out.println("fibonacci "+b+"");
        for(int i=2;i<=num;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c +" ");
        }
    }
}