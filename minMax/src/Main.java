import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        System.out.println("Bir sayı giriniz : ");
        int number = scan.nextInt();
        System.out.println("Girilen sayı : " +number);

        Arrays.sort(list);
        int min = list[0];
        int max = list[list.length-1];

        for (int i=0;i< list.length;i++) {
            if (list[i] < number) {
                if (list[i]>min){
                    min = list[i];
                }

            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " +min);

        for (int j=0;j< list.length;j++){
            if (list[j] > number){
                if (list[j] < max){
                    max = list[j];
                }
            }
        }
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);

    }
}