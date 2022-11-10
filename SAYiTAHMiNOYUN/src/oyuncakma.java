import java.util.*;
public class oyuncakma {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        Random rnd=new Random();
        System.out.println("Sayı tahmin oyunana hoşgeldin");
        System.out.print("1000 e kadar bir sayı girin:");
        int sayi=rnd.nextInt(1000);
        int tahmin= girdi.nextInt();
        int i=1;


        while(sayi !=tahmin){

            if (tahmin<0 || tahmin >1000){
                System.out.print("Girdiğiniz değer hatalı lütfen 0 ile 1000 aralığında bir sayı giriniz:");
                i++;
            } else if (tahmin<sayi) {
                System.out.print("Daha büyük bir değer giriniz:");
                i++;


            }
            else{
                System.out.print("Daha küçük bir değer giriniz:");
                i++;
            }
            tahmin= girdi.nextInt();

        }
        System.out.print("Tebrikler oyunu kazandınız "+i+" kere denediniz.");





    }
}
