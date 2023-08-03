
package palindrom;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int enter = scan.nextInt();
        int number=enter,reverse=0,last;
        
        while(number !=0){
            last=number%10;
            reverse=(reverse*10) + last;
            number/=10;
            
            
        }
       
        if(enter == reverse){
                System.out.println("Sayı Palindromdur.");
            }else{
                System.out.println("Tekrar deneyiniz.");
            }
        
    }
}
