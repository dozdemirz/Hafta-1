import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a sayısını girin: ");
        double a = input.nextDouble();

        System.out.print("b sayısını girin: ");
        double b = input.nextDouble();

        System.out.print("c sayısını girin: ");
        double c = input.nextDouble();

        double sonuc = a + b * c - b;

        System.out.println("İşlem sonucu: " + sonuc);


    }
}