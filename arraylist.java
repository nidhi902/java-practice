import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> ls=new ArrayList<>();
        ArrayList<Integer> ls2=new ArrayList<>();
        ls.add(9);
        ls.add(89);
        ls.add(90);
        
        // ls.remove(1);
        ls2.addAll(ls);
        // ls.clear();
        System.out.println(ls.contains(87));
        ls.set(1, 99);
        System.out.println("first array"+ls);
        System.out.println("second array is"+ls2);

        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i));
        }
    }
}
