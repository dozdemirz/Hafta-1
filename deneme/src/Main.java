import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.

import java.util.Scanner;

public class AirfareCalculator {
    public static void FareCalc() {
        Scanner scanner = new Scanner(System.in);

        // Mesafe (KM), Yaş ve Yolculuk Tipi (1: Tek Yön, 2: Gidiş-Dönüş) bilgilerini alıyoruz.
        System.out.print("Mesafe (KM): ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınız: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk Tipi (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        // Veri doğrulama: Mesafe, yaş ve yolculuk tipi geçerli mi kontrol ediyoruz.
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // Mesafe başına ücret (0.10 TL/KM)
        double ucret = mesafe * 0.10;

        // Yaş indirimleri
        if (yas < 12) {
            ucret *= 0.5; // 12 yaşından küçükse %50 indirim
        } else if (yas <= 24) {
            ucret *= 0.9; // 12-24 yaş arası ise %10 indirim
        } else if (yas >= 65) {
            ucret *= 0.7; // 65 yaşından büyükse %30 indirim
        }

        // Yolculuk tipi indirimi (Gidiş-Dönüş)
        if (yolculukTipi == 2) {
            ucret *= 0.8; // Gidiş-Dönüşse %20 indirim
        }

        System.out.println("Toplam Bilet Fiyatı: " + ucret + " TL");

        scanner.close();
    }
}