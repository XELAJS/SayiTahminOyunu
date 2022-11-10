import java.util.*;
public class oyuncakma {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        Random rnd=new Random();
        System.out.println("Sayı tahmin oyunana hoşgeldin");
        System.out.print("1000 e kadar bir sayı gir aga:");
        int sayi=rnd.nextInt(1000);
        int tahmin= girdi.nextInt();


        while(sayi !=tahmin){

            if (tahmin<0 || tahmin >1000){
                System.out.print("Yanlış girdin aga:");
            } else if (tahmin<sayi) {
                System.out.print("Daha büyük gir aga:");

            }
            else{
                System.out.print("Daha küçük gir aga:");
            }
            tahmin= girdi.nextInt();

        }
        System.out.print("Oyunu kazandın reisim");





    }
}
