package mijnhuiswerk;

import java.util.Scanner;

public class HJava04 {

    public static void main(String[] args) {


        //1) Kullanıcıdan karenin kenar uzunluğunu alin ve sonra bu karenin alan ve
        //çevresini hesaplayıp ekrana yazdıran bir program yazınız.
        //Not: Alan: Boy x En
        //Not: Çevre: 2x (Boy + En)

        Scanner input = new Scanner(System.in);

        System.out.println("karenin kenar uzunlugunu giriniz");
        int kare = input.nextInt();

        System.out.println("karenin alani " + kare*kare);
        System.out.println("karenin cevresi " + kare*4);



        //2) Kullanıcıdan alınan bir sayının küpünü hesaplayan bir program yazınız.
        //Not: a’ nın küpü: a x a x a

        Scanner input2 = new Scanner(System.in);
        System.out.println("bir sayi giriniz.");
        int sayi = input2.nextInt();
        System.out.println("sayinin kupu " + sayi*sayi*sayi);

        //3) Kullanıcıdan dikdörtgenin boyutlarını alan ve sonra diktörtgenin alan ve
        //cevresini hesaplayıp ekrana yazdıran bir program yazınız.
        //Not: Alan: Boy x En
        //Not: Çevre: 2x (Boy + En)

        Scanner input3 = new Scanner(System.in);
        System.out.println("uzun kenari giriniz.");
        int uzun = input3.nextInt();
        System.out.println("kisa kenari giriniz.");
        int kisa = input3.nextInt();
        System.out.println("dikdortgenin alani " + uzun*kisa);
        System.out.println("dikdortgenin cevresi " + (uzun+kisa)*2);

        //4) Boyutları kullanıcıdan alınan bir dikdörtgenler prizmasının hacmini hesaplayan bir
        //program yazınız.
        //Not: Dikdörtgenler Prizmasının Hacmi: En x Boy x Yükseklik

        Scanner input4 = new Scanner(System.in);
        System.out.println("eni giriniz.");
        int en = input4.nextInt();
        System.out.println("boyu giriniz.");
        int boy = input4.nextInt();
        System.out.println("yuksekligi giriniz.");
        int yukseklik = input4.nextInt();
        System.out.println("prizmanin hacmi " + en*boy*yukseklik);

        //5) Yarıçapı kullanıcıdan alınan bir dairenin çevresini ve alanını hesaplayan
        //bir program yazınız. (float kullanınız)
        //Not 1: pi sayısı: 3.14159
        //Not 2: Alan: 3.14159 x radius x radius
        //Not 3: Cevre: 2 x 3.14159 x radius

        Scanner input5 = new Scanner(System.in);
        System.out.println("yaricapi giriniz.");
        float r = input5.nextFloat();
        float pi = 3.14159F;
        System.out.println("dairenin alani " + pi*r*r);
        System.out.println("dairenin cevresi " + 2*pi*r);

        //6) Kenar uzunlukları kullanıcıdan alınan bir üçgenin çevresini hesaplayan bir
        //Program yazınız. (byte kullanınız)
        //Not 1: Üçgenin Cevresi: a + b + c

        Scanner input6 = new Scanner(System.in);
        System.out.println("ilk kwnari giriniz.");
        byte a = input6.nextByte();
        System.out.println("ikinci kenari giriniz.");
        byte b = input6.nextByte();
        System.out.println("ucuncu kenari giriniz.");
        byte c = input6.nextByte();
        System.out.println("ucgenin cevresi " + (a+b+c));

        //7)  Mil’i kilometreye çeviren bir program yazınız. (double kullanınız)
        //Not 1: km = mile x 1.6

        Scanner input7 = new Scanner(System.in);
        System.out.println("mili giriniz.");
        double mil = input7.nextDouble();
        System.out.println("kilometre cinsi " + mil*1.6 + " km");

        // 8) Saati saniyeye çeviren bir program yazınız. (long kullanınız)
        //Not 1: Saniye = Saat x 60 x 60

        Scanner input8 = new Scanner(System.in);
        System.out.println("bir saat giribiz");
        long saat = input.nextLong();

        long saniye = saat*60*60;

        System.out.println("Gridiginiz saat " + saniye + " saniyedir.");

        // 9) 1) Kullanıcıdan “ * ” gibi bir sembol alin
        //2) Ekrana asagidaki sekli yazdırın
        //    *
        //   *  *
        //  *  *  *


        Scanner input9 = new Scanner(System.in);
        System.out.println("bir karakter giribiz");
        char k = input9.next().charAt(0);
        System.out.println("\n   " + k + "\n  " + k + " " + k + "\n " + k + " " + k + " " + k) ;



       // 1) Kullanıcıdan ad ve soyadını alıp ekrana yazdıran bir program yazınız.
        //(String kullanınız)

        Scanner input10 = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String ad = input10.nextLine();
        System.out.println("Lutfen soyadinizi giriniz.");
        String soyad = input10.nextLine();
        System.out.println("adiniz ve soyadiniz: " + ad + " " + soyad);

        //2) Kullanıcıdan ad, soyad ve adresini alıp ekrana yazdıran bir program yazınız.
        //Ad ve soyad ilk satırda, adres ikinci satırda olsun.
        //(String kullanınız)

        Scanner input11 = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String adi = input10.nextLine();
        System.out.println("Lutfen soyadinizi giriniz.");
        String soyadi = input10.nextLine();
        System.out.println("Lutfen adresinizi giriniz.");
        String adres = input10.nextLine();

        System.out.println("adiniz ve soyadiniz: " + adi + " " + soyadi);
        System.out.println("adresiniz: " + adres);





    }
}
