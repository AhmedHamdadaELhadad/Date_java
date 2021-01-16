package example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataDemo {
    // class Date built in java  

    public static void main(String[] arg) {
        
        Date myDate =new Date();
        System.out.println("my time in any day in " + myDate);
        SimpleDateFormat ft = new SimpleDateFormat(" yyyy E MMM.dd 'at' hh:mm:ss a zzz");
        System.out.println(ft.format(myDate));

    } // end main
}// end class

