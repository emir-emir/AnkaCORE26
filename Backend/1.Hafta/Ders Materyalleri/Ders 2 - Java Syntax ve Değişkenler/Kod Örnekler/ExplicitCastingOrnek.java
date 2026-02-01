public class ExplicitCastingOrnek {
    public static void main(String[] args) {

        double sayi = 10.75; // double (büyük kapasite)
        int sonuc = (int) sayi; // double → int (manuel)

        System.out.println("double değer: " + sayi);
        System.out.println("int değer : " + sonuc);
    }
}
