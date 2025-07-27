public class givenarrrayispresent {
    public static void main(String[] args) {
        float marks[]={34.0f,54.0f,55.0f,90.0f};
        float num=77.0f;
        boolean isinarray=false;
        for(float element: marks){
            if(num==element){
                isinarray=true;
                break;
            }

        }
        if(isinarray){
            System.out.println("value is present in the array");
        }
        else{
            System.out.println("value is not present in thr array");
        }



    }
}
