import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        int total=0;

        for (int i=1; i<= number-1; i++ ){
            if (number % i ==0){
                total+=i;
            }
        }
        if (total == number){
            System.out.println(number + " sayısı mükemmel sayıdır.");
        }else {
            System.out.println(number + " sayısı mükemmel sayı değildir.");
        }
    }
}