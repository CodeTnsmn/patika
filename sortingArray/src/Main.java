import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz : ");
        int size = input.nextInt();

        int [] list = new int [size] ;

        System.out.println("Dizinin elemanlarını girin : ");

        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Eleman = ");
            list [i] = input.nextInt();
        }
        System.out.print("Sıralama : ");
        sorting(list);

    }

    public static void sorting (int [] list) {
        for(int i = 0; i < list.length; i++) {
            int min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    minIndex = j ;
                }
            }
            int temp = list[i] ;
            list [i] = list[minIndex];
            list[minIndex] = temp ;
        }
        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}