
import java.math.*;
import java.io.File;
import java.util.Scanner;

public class exogit {
    public static void main(String[] args) {
        Scanner tap = new Scanner(System.in);
        int a;
        int b;
        System.out.println("entrer deux valeurs a et b");
        a = tap.nextInt();
        b = tap.nextInt();
        if (a > b) {
            System.out.println("le maximum est:" + a);
            System.out.println("le minimum est:" + b);
        } else {
            System.out.println("le maximum est:" + b);
            System.out.println("le minimum est:" + a);
        }
    }
}
