public class MyThread implements Runnable{
    @Override
    public void run() {
        //task
        int i;
        for( i=0;i<10;i++){//this is a blueprint
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
        }
    }
    public static void main(String[] args){
    MyThread th=new MyThread();
    Thread thr=new Thread(th);
    thr.start();
    AnotherThread ar=new AnotherThread();
    ar.start();

       }
}
