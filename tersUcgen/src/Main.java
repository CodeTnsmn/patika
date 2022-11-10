import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Adım sayısını giriniz : ");
        x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j =2*x-1; j >2*i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}