import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner not = new Scanner(System.in);
        System.out.println("Geçme Notu Hesaplama : ");

        int vizeNotu, finalNotu;
        double notOrtalaması=0;

        System.out.println("Vize notunuzu giriniz : ");
        vizeNotu=not.nextInt();

        System.out.println("Final notunuzu Giriniz : ");
        finalNotu=not.nextInt();

        notOrtalaması=vizeNotu * 0.4 + finalNotu * 0.6 ;

        System.out.println("Not Ortalamanız : "+notOrtalaması);
        if(notOrtalaması>85){
            System.out.println("AA   GEÇTİ");
        }
        else if (notOrtalaması>70) {
            System.out.println("BB   GEÇTİ");
        }
        else if (notOrtalaması>60) {
            System.out.println("CC    GEÇTİ");
        }
        else if (notOrtalaması>50){
            System.out.println("DD    GEÇTİ");
        }
        else {
            System.out.println("FF    KALDI");
        }
        System.out.println("-------------------------------------------------------");
        
        System.out.println("Yaşa Göre Ehliyet Alma Kuralları");

        Scanner yas = new Scanner(System.in);

        int adayYası;
        adayYası=yas.nextInt();

        if(adayYası<18){
            System.out.println("Aday 18. yaşını doldurmalıdır.");
        }else{
            System.out.println("Aday yaşı ehliyet için uygundur.");
        }
        System.out.println("--------------------------------------------------------");
        
        System.out.println("En Büyük Sayıyı Bulma : ");
        Scanner sayi = new Scanner(System.in);
        double sayi1,sayi2,sayi3,maxSayi ;

        System.out.println("1. Sayıyı Giriniz: ");
        sayi1=sayi.nextDouble();

        System.out.println("2.Sayıyı Giriniz : ");
        sayi2=sayi.nextDouble();

        System.out.println("3. Sayıyı Giriniz : ");
        sayi3=sayi.nextDouble();
        
        maxSayi=sayi1;

        if(sayi2>maxSayi){
           maxSayi=sayi2;

        }  if (sayi3>maxSayi) {
           maxSayi=sayi3;

        }
        System.out.println("En Büyük Sayı : "+maxSayi);
    }
}