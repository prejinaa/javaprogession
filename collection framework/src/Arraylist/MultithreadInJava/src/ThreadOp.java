class UserThread extends Thread{
    @Override
    public void run() {
        //task assign
        System.out.println("this is a user create");
    }
}
public class ThreadOp {
    public static void main(String[] args){
        System.out.println("starting the the thread");
        int x=15+39;
        System.out.println("the sum is"+x);
       Thread thr= Thread.currentThread();//we get current thread class object and store in variable
         String str=thr.getName();
        System.out.println("the current thread is"+" "+str);//
         thr.setName("myname");
        System.out.println(thr.getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //going to start user define thread
        UserThread thres=new UserThread();
        thres.start();

        System.out.println("Programm endded");
       // System.out.println(thr.threadId());
    }
}
