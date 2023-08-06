import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, temp;
        System.out.print("Bir Sayı Giriniz: ");
        num = scan.nextInt();
        desen(num, temp = num, true);
    }

          public static int desen(int num, int temp, boolean stop) {
                System.out.println(num);
                if (num < 0 || num == 0 || !stop) {
                    stop = false;
                    if (num != temp) {
                        return desen(num + 5, temp, stop);
                    } else
                        return 0;
                } else {
                    return desen(num - 5, temp, stop);
                }
            }
}