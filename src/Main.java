import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char v1 = scn.next().charAt(0);
        if (v1 - 'A' >= 0 && v1 - 'A' < 26) {
            System.out.println("uppercase");
        } else if (v1 - 'a' >= 0 && v1 - 'a' < 26) {
            System.out.println("lowercase");
        } else {
            System.out.println("special character");
        }
    }
}