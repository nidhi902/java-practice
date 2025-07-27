public class issorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,10,6,7,8,9};

        boolean issorted=true;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                issorted=false;
                break;

            }
        }
        if(issorted){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}
