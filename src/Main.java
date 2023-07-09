import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*

        //Armstrong Sayıları Bulan Program
       Scanner input = new Scanner(System.in);
       System.out.println("Sayı giriniz: ");
       int number = input.nextInt();
       int basNumber=0;
       int tempNumber=number;
       int basValue;
       int result=0;
       int basPow;


       while (tempNumber !=0){
           tempNumber/=10;
           basNumber++;

       }
        tempNumber=number;
       while (tempNumber !=0){
           basValue=tempNumber%10;
           basPow=1;
           for (int i=1; i <=basNumber;i++){
               basPow*=basValue;

           }
            result+=basPow;
           tempNumber/=10;

       }
        System.out.println(result);

       */

        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");

        int sayi=input.nextInt();

        int total=0;
        int tempSayi=sayi;

        while (tempSayi !=0){
            int basamak =tempSayi % 10;//son basamağı al
            total +=basamak;//toplama ekle
            tempSayi /=10;
        }
        System.out.println("Basamakların toplamı: " + total);










    }
}