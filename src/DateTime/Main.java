package DateTime;

import DateTime.tanggal.TimeJon;

import java.util.Scanner;

import static DateTime.tanggal.Ajuss.adjustDate;
import static DateTime.tanggal.dateCalculator.calculateDiff;

public class Main {
    public static void main(String[] args) {
        String birthDate;
        TimeJon.showTimeZone();
        adjustDate();
        Scanner in = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("PBI 2 - input your birthday (yyyy-mm-dd): ");
        birthDate = in.next();
        try {
            calculateDiff(birthDate);
        }
        catch(Exception e){
            System.out.println("please input the correct birthdate");
        }
    }
}
