package work;

public class GBOXT1 {
    public static void main(String[] args) {
        GBOXT<String> box1=new GBOXT<String>("prejina");//here we make general class object  secure type cas

        //box.container=123;
        System.out.println(box1.getContainer());
        System.out.println(box1.getContainer().getClass().getName());



    }
}
