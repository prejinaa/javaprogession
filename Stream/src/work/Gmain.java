package work;

import javax.swing.*;
import java.awt.*;
//we can use object class to make general type,
//it doe not provide type savety

public class Gmain {
    public static void main(String[] args) {
        GBox box=new GBox("prejina");
        //box.container=123;
        System.out.println(box.getContainer());

    }
}
