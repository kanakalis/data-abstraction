
import java.util.Calendar;
import java.util.Date;
public class Test {

    public static void main(String args[]){
        Customer c = new Customer("kan k",737800,1000,400);
        Calendar cal = Calendar.getInstance();
        Date date;

        //Deposit of: $400.0 Date: Sun Nov 04 00:00:00 PDT 2018 into account: Checking
        cal.set(Calendar.MONTH, 10);    //to set date
        cal.set(Calendar.DATE, 04);
        cal.set(Calendar.YEAR, 2018);
        cal.set(Calendar.HOUR_OF_DAY,00);
        cal.set(Calendar.MINUTE,00);
        cal.set(Calendar.SECOND,00);
        date = cal.getTime();
        c.deposit(400, date,Customer.CHECKING); //deposit 400

        //Deposit of: $500.0 Date: Thu Aug 16 10:52:17 PDT 2018 into account: Saving
        cal.set(Calendar.MONTH, 7);    //to set date
        cal.set(Calendar.DATE, 16);
        cal.set(Calendar.YEAR, 2018);
        cal.set(Calendar.HOUR_OF_DAY,10);
        cal.set(Calendar.MINUTE,52);
        cal.set(Calendar.SECOND,17);
        date = cal.getTime();
        c.deposit(500, date,Customer.SAVING); //deposit 400
        c.displayDeposits();

        System.out.println();

        //Withdraw of: $400.0 Date: Sun Nov 04 00:00:00 PDT 2018 into account: Checking
        cal.set(Calendar.MONTH, 7);    //to set date
        cal.set(Calendar.DATE, 04);
        cal.set(Calendar.YEAR, 2018);
        cal.set(Calendar.HOUR_OF_DAY,00);
        cal.set(Calendar.MINUTE,00);
        cal.set(Calendar.SECOND,00);
        date = cal.getTime();
        c.withdraw(400, date,Customer.CHECKING); //withdraw 400

        //Withdraw of: $400.0 Date: Sun Nov 04 00:00:00 PDT 2018 into account: Checking
        cal.set(Calendar.MONTH, 7);    //to set date
        cal.set(Calendar.DATE, 16);
        cal.set(Calendar.YEAR, 2018);
        cal.set(Calendar.HOUR_OF_DAY,10);
        cal.set(Calendar.MINUTE,52);
        cal.set(Calendar.SECOND,17);
        date = cal.getTime();
        c.withdraw(500, date,Customer.SAVING); //withdraw 400
        c.displayWithdraws();
        System.out.println("---");

    }
}
