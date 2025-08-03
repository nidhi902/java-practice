import java.util.Scanner;

public class fibonacci_recursively {
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int result=fibonacci(num);

        // System.out.println(result); //single  

        for(int i=0;i<num;i++){
            System.out.print(fibonacci(i));
        }
        
        

       
    }
    
}
