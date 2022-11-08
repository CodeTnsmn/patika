import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, max = 0, min = 0, num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç sayı gireceksiniz: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". sayıyı giriniz.");
            num = scanner.nextInt();

            if (i == 1) {
                min = num;
                max = num;
            } else {
                if (num <= min) {
                    min = num;
                } else {
                    max = num;
                }
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
