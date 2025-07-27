import java.util.Scanner;

public class  converttemp{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temp 67 celcius");
        double celcius = sc.nextDouble();
        double foren = (celcius * 9/5)+32;
        double kelvin = celcius + 273.15;
        
        System.out.println(foren);
        System.out.println(kelvin);

        if(celcius<10){
            System.out.println("cold");

        }
        else if(celcius<=25){
            System.out.println("moderate");
        }
        else{
            System.out.println("hot");
        }
        sc.close();



    }
}