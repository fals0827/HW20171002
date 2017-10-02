import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if (x<-1){
            System.out.println((int)Math.pow(x,2)*3);
        }
        if (x>=-1 && x<=1){
            System.out.println((int)Math.pow(x,3)+x*3-3);
        }
        if (x>1){
            System.out.println(2*x+3);
        }
    }
}