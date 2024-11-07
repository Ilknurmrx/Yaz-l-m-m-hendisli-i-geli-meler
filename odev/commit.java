import java.util.Scanner;

public class commit {
    public static void main(String[] args) {
        //isim yazdirma
        System.out.println("İlknur"); 
        Scanner scanner = new Scanner(System.in);
        
        
        //ortalama hesaplama
        System.out.print("Kaç sayının ortalamasını hesaplamak istiyorsunuz? ");
        int n = scanner.nextInt();
        double toplam = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı girin: ");
            double sayi = scanner.nextDouble();
            toplam += sayi;
        }
 
        double ortalama = toplam / n;
        System.out.println("Girilen sayıların ortalaması: " + ortalama);


        //kullanıcının girdiği iki sayinin toplamı:
        System.out.print("birinci sayiyi giriniz: ");
        int sayi1 =scanner.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        int sayi2 =scanner.nextInt();
        int toplami = sayi1+sayi2;
        System.out.println("sayi1+sayi2= "+ toplami);
        


        //kullanıcının girdiği iki sayinin carpimi:
        System.out.print("birinci sayiyi giriniz: ");
        int a =scanner.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        int b =scanner.nextInt();
        int carpim = a*b;
        System.out.println("a*b= "+ carpim);
        scanner.close();
        

        //plaka kodunun degistirilmesi
        System.out.print("burda plakayi 24 olarak degistiriyorum");
        System.setProperty("server.port", "24");
    





    }
}

