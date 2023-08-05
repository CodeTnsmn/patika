import java.util.Scanner;

public class Main {

    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        int select, a = 0, b=0, result = 0;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
            System.out.println(menu);

        while (true) {

            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }
            if (select==6){
                factorial();
                break;
            }else{
                System.out.println("1.sayı: ");
                a = scan.nextInt();
                System.out.println("2.sayı :");
                b = scan.nextInt();

            }

            switch (select) {
                case 1:
                    plus(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    calc(a,b);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }
    }

    static int plus(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);

        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divided(int a, int b) {
        int result = a / b;
        System.out.println("Bölme : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Power : " + result);
        return result;
    }

    static void factorial() {
        System.out.println("Bir sayı giriniz : ");
        int a = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= a; i++) {

            result *= i;
        }
        System.out.println(result);
    }

    static int mod(int a,int b){
        int result= a % b;
        System.out.println("Mod : "+ result);
        return result ;
    }

    static void calc(int a,int b){
        System.out.println("Çevresi : "+ 2 * (a+b));
        System.out.println("Alan : " + (a*b));
    }
}
