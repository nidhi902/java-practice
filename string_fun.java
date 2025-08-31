import java.util.Scanner;

public class string_fun {
    public static void main(String[] args){
        //definition of string
        // String name="nidhi";
        // System.out.println(name);

        // //taking input string
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter your name:");
        // String input=sc.nextLine();
        // System.out.println("my name is "+input);

        //length function
        // System.out.println("length of name is: "+input.length());

        //ITERATION OF STRING
        // for(int i=0;i<=input.length();i++){
        //     System.out.println(input.charAt(3));
        // }

        //string comparison
        // String name1="hello";
        // String name2="hello";

        // if(name1.compareTo(name2)==0){
        //     System.out.println("Strings are equal");

        // }
        // else if(name1.compareTo(name2)>0){
        //     System.out.println("name1 is greaterthan name2");

        // }
        // else{
        //      System.out.println("name1 is lessthan name2");


        // }

        //another method == is not good thing to compare strings 
        if(new String("tomy")==new String("tomy")){
            System.out.println("equall");
        }
        else{
            System.out.println("not equal");
        }
        
        //substring method string ka chota bhag

        String sen="my name is nidhi";
        String name=sen.substring(5,sen.length());
        System.out.println(name);

        




    }
    
}
