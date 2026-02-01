import java.util.Scanner;

public class ScannerOrnek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String ad = scanner.nextLine();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Boyunuzu giriniz (örn: 1.75): ");
        double boy = scanner.nextDouble();

        System.out.println("\n--- Kullanıcı Bilgileri ---");
        System.out.println("Ad: " + ad);
        System.out.println("Yaş: " + yas);
        System.out.println("Boy: " + boy);
    }
}

