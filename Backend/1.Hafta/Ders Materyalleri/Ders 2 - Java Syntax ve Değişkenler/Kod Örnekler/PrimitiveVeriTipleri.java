public class PrimitiveVeriTipleri {
    public static void main(String[] args) {

        byte byteDeger = 100; // byte → çok küçük tam sayılar (-128 / 127)
        System.out.println("byte: " + byteDeger);

        short shortDeger = 32000; // short → küçük tam sayılar
        System.out.println("short: " + shortDeger);

        int intDeger = 100000; // int → en çok kullanılan tam sayı tipi
        System.out.println("int: " + intDeger);

        long longDeger = 9_000_000_000L; // long → çok büyük tam sayılar (sonuna L konur)
        System.out.println("long: " + longDeger);

        float floatDeger = 3.14f; // float → ondalıklı sayı (sonuna f konur)
        System.out.println("float: " + floatDeger);

        double doubleDeger = 3.14159265359; // double → ondalıklı sayı (varsayılan)
        System.out.println("double: " + doubleDeger);

        char charDeger = 'A'; // char → tek karakter (tek tırnak)
        System.out.println("char: " + charDeger);

        boolean booleanDeger = true; // boolean → true / false
        System.out.println("boolean: " + booleanDeger);
    }
}
