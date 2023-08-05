import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban : ");
        int taban = scan.nextInt();
        System.out.println("Us : ");
        int us = scan.nextInt();

        System.out.println("Sonuç : " + usAl(taban,us));
    }

    public static int usAl(int taban,int us){
        if (taban==1 || us==0){
            return 1;
        }

        return taban * usAl(taban,us-1);
    }
}