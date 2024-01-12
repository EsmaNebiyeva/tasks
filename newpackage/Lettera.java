package newpackage;
import java.util.Scanner;

public class Lettera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hündürlüyü daxil edin: ");
        int hundurluk = scanner.nextInt();
        for (int i = 1; i <= hundurluk; i++) {
            for (int j = hundurluk; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1 || i == hundurluk / 2 + 1) {
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
