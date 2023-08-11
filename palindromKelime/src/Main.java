import java.util.Scanner;

public class Main {
    static boolean isPalindrome(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz : ");
        String str = scan.nextLine();

        int i=0;
        int j=str.length()-1;

        while (i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;

        }

        return  true ;
    }

    public static void main(String[] args) {


        System.out.println(isPalindrome());

    }
}