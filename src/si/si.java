package si;

import java.util.Scanner;

public class si {
    public static void main(String[] args) {
        float principal=0,rate=0,time=0;
        float si=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal amount\n");
        principal=in.nextFloat();
        System.out.println("Enter the rate of interest\n");
        rate=in.nextFloat();
        System.out.println("Enter the time period in months\n");
        time=in.nextFloat();
        si=(principal*rate*time)/100;
        System.out.println("Simple interest is" + si);
    }
}

/*
OUTPUT
Enter the principal amount
1000
Enter the rate of interest
5
Enter the period in months
12
Simple interest is 600
*/


