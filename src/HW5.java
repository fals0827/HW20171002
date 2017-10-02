import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a <= 1000 && a >=1) {
            int b = a/1000;
            int c = a%1000;
            int d = c/100;
            int e = c%100;
            int f = e/10;
            int g = e%10;
            System.out.println(b+" thousand "+d+" hundred "+f+" ten "+g+" dollar ");
        }
    }
}