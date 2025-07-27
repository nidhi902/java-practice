public class duplicateinarray {
    public static void main(String[] args) {
        int [] arr={4,56,3,346,34,64,34,44,44};

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]==arr[j])&&(i!=j)){
                    System.out.println("the duplicate value is " + arr[j]);
                }
            }
        }
    }
}
