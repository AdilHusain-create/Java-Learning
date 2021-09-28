import java.util.Scanner;
import java.time.LocalDate;

// SSolution one
public class Solution {

    public static void main(String[] args){
       
       Scanner in = new Scanner(System.in);

        int mm = in.nextInt();           //String month = in.next();

        int dd = in.nextInt();           //String day = in.next();

        int yy = in.nextInt();           //String year = in.next();

        in.close();
        LocalDate dt = LocalDate.of(yy, mm, dd);
        System.out.print(dt.getDayOfWeek());
}
}

// Solution two
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class DayFromDate {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String input_date= scanner.next();
        SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
        Date dt1=format1.parse(input_date);
        DateFormat format2=new SimpleDateFormat("EEEE");
        String finalDay=format2.format(dt1);

        System.out.println(finalDay);
          
    
    }
}


