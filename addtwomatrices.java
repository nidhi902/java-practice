public class addtwomatrices {
    public static void main(String[] args) {
        int arr1[][]={{2,3,4},{3,5,7}};
        int arr2[][]={{4,6,7},{6,7,4}};

        int result[][]={{0,0,0},{0,0,0}};

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                result[i][j]=arr1[i][j]+arr2[i][j];
               
            }
        }

         for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                 System.out.print(result[i][j]  +" ");
                result[i][j]=arr1[i][j]+arr2[i][j];
               
            }
            System.out.println(" ");
        }
        




    }
 }

