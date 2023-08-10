import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int number = random.nextInt(100);
        Scanner input = new Scanner(System.in);
        int selected;
        int[] wrongGuess = new int [5];
        boolean isWin = false;

        for (int right = 0; right < 5; right++) {
            System.out.print("Lütfen tahmininizi giriniz. (0-100 arasında) : ");
            selected = input.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir sayı giriniz!");
                continue;
            }
            if (selected == number) {
                isWin = true;
                System.out.println("Tebrikler doğru tahmin! " + "Gizli sayı : " + number);
                break;
            }
            else {
                System.out.println("Yanlış sayı girdin!");
                if (selected > number) {
                    System.out.println("Tahminin gizli sayıdan büyük");
                }
                else {
                    System.out.println("Tahminin gizli sayıdan küçük");
                }
                wrongGuess[right] = selected;
                System.out.println("Kalan hak : " + (4 - right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz..!" + " Tahminleriniz : " + Arrays.toString(wrongGuess));
            System.out.println("Gizli sayı : " + number);
        }

    }
}