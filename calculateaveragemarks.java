public class calculateaveragemarks {
    public static void main(String[] args) {
        int marks[]={34,55,33,55,67,78};
        int sum=0;
        for(int element: marks){
            sum=sum+element;
    }
    System.err.println("average of the marks is ="+sum/marks.length);

}
}