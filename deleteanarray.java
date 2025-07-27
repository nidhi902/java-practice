public class deleteanarray {
    public static void main(String[] args) {
        int arr[]={7,9,7,5,4,3,2,1};
        int index=4;

        for(int i=index;i<arr.length-1;i++){
            arr[i]=arr[i+1];

        }
        
        System.out.println("array after deletion");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]);
        }
    }
}
