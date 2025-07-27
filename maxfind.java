public class maxfind {
    public static void main(String[] args) {
        // int arr[]={67,123,34,56,33,3,9,0,500};
        // int max= Integer.MAX_VALUE;
        // int max=0;

        // for(int e: arr){
        //     if(e>max){
        //         max=e;
        //     }
        // }
        // System.out.println(max);

          int arr[]={3,5,2,1,4,5,3,0,7};
        // int max= Integer.MAX_VALUE;
        int min= arr[0];

        for(int e: arr){
            if(e<min){
               min=e;
               

            }
            
        }
        System.out.println(min);

        
    }
}
