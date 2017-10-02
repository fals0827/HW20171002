import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count1 = 0, count2 = 0, count3 = 0;

        int num1 = scn.nextInt();
        if (num1 > 0) { count1++; }
        else if (num1 == 0) { count2++; }
        else if (num1 < 0) { count3++; }

        int num2 = scn.nextInt();
        if (num2 > 0) { count1++; }
        else if (num2 == 0) { count2++; }
        else if (num2 < 0) { count3++; }

        int num3 = scn.nextInt();
        if (num3 > 0) { count1++; }
        else if (num3 == 0) { count2++; }
        else if (num3 < 0) { count3++; }

        int num4 = scn.nextInt();
        if (num4 > 0) { count1++; }
        else if (num4 == 0) { count2++; }
        else if (num4 < 0) { count3++; }

        int num5 = scn.nextInt();
        if (num5 > 0) { count1++; }
        else if (num5 == 0) { count2++; }
        else if (num5 < 0) { count3++; }

        int num6 = scn.nextInt();
        if (num6 > 0) { count1++; }
        else if (num6 == 0) { count2++; }
        else if (num6 < 0) { count3++; }
        System.out.println("+ ="+count1+"\n"+"0 ="+count2+"\n"+"- ="+count3);
    }
}