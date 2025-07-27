public class sortanarray {
    public static void main(String[] args) {
        int arr[]={34,2,1,39,54,35,0,323,};
        int temp=0;
        // ascending order 
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int e: arr){
            System.out.print(e +"  ");
        }
    }
}
