public class sumofarray {
    public static void main(String[] args) {
        int marks[]={45,32,45,22,11,34};
        int sum=0;
        for(int element:marks){
            sum=sum+element;
        }
        System.out.println(sum);
    }
}
