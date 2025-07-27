class mythread1 extends Thread{
    public void run(){
        int i=0;
        while(i<20000){
        System.out.println("this is first thread");
        System.out.println("i am happy");
    }
    }
}

class mythread2 extends Thread{
    public void run(){
        int i=0;
        while(i<2000){
        System.out.println("this is thread2");
        System.out.println("i am sad");
        i++;
    }
    }
}

public class multithread{
    public static void main(String[] args) {
        mythread1 obj=new mythread1();
        mythread2 obj2=new mythread2();
        obj.start();
        obj2.start();

        
        
    }
}
