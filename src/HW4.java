import java.util.Scanner;

public class HW4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if (a<=b && b<=c && a+b>c){
            if (a*a+b*b==c*c){
                System.out.println("True");
            }else { System.out.println("False");}
        }else {
            System.out.println("False");
        }
    }
}