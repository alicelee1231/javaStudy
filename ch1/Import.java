import java.text.SimpleDateFormat;
import java.util.Date;

class Import{
    public static void main(String[]args){
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("today's date is " + date.format(today));
        System.out.println("it's " + date.format(today));
    }
}