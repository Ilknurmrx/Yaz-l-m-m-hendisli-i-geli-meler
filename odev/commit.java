import java.util.Scanner;

public class commit {
    public static void main(String[] args) {
        // İsminizi yazdırma
        System.out.println("İlknur"); // Kendi isminizi buraya yazın

        // Kullanıcıdan veri almak için Scanner nesnesi
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kaç sayının ortalamasını hesaplayacağını sor
        System.out.print("Kaç sayının ortalamasını hesaplamak istiyorsunuz? ");
        int n = scanner.nextInt();

        double toplam = 0;

        // Girilen sayıları toplama
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı girin: ");
            double sayi = scanner.nextDouble();
            toplam += sayi;
        }

        // Ortalama hesaplama ve sonucu yazdırma
        double ortalama = toplam / n;
        System.out.println("Girilen sayıların ortalaması: " + ortalama);

        // Scanner nesnesini kapatma
        scanner.close();
    }
}

