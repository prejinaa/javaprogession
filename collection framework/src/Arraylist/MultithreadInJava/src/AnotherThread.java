public class AnotherThread extends Thread {
    public void run() {
        //task
        int i;
        for (i = 0; i < 10; i++) {//this is a blueprint
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }

    }
}
