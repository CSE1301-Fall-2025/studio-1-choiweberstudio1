package studio1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a year");
        int year0 = in.nextInt();
        int year1 = year0 % 4;
        int year2 = year0 % 100; 
        int year3 = year0 % 400;
        boolean leap = ((year1 == 0) && (year2 != 0)) || (year3 == 0);
        System.out.println(leap);

}
}