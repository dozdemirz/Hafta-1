import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişken
        int birthDate;
        String horoscope="";
        Boolean isError=false;

        //Scanner objesi
        Scanner inpt = new Scanner(System.in);

        //Kullanıcı verisi al
        System.out.print("Lütfen doğum yılınızı giriniz :");
        birthDate = inpt.nextInt();
        int number = (birthDate % 12);

        //Burcu bulmak için switch yapısını kullan
        switch (number) {
            case 0 -> horoscope = " Maymun";
            case 1 -> horoscope = " Horoz";
            case 2 -> horoscope = " Köpek";
            case 3 -> horoscope = " Domuz";
            case 4 -> horoscope = " Fare";
            case 5 -> horoscope = " Öküz";
            case 6 -> horoscope = " Kaplan";
            case 7 -> horoscope = " Tavşan";
            case 8 -> horoscope = " Ejderha";
            case 9 -> horoscope = " Yılan";
            case 10 -> horoscope = " At";
            case 11 -> horoscope = " Koyun";
            default -> isError = true;
        }
        if (isError){
            System.out.print("Hatalı giriş yaptınız!");
        }else {
            System.out.print("Çin Zodyağı Burcunuz : "+horoscope);
        }
    }
}