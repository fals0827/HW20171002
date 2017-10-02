import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt()%2;
        if (a == 1){
            System.out.println("Odd");
        }else {
            System.out.println("Even");
        }
    }
}