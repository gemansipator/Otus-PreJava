package javalanguage.syntax;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world II!");
        //byte (1 байт или 8 бит), short (2 байта), int (4 байта или 32 бита), long  (8 байт)
        //boolean (1), char (2), float (4), double (8)

        //Преобразование типов НЕ ЯВНОЕ

        byte a = 127;
        short s = a;
        long d = s;
        System.out.println(a +" "+ s +" "+ d);


        //Преобразование типов ЯВНОЕ
        byte a1 = 127;
        short s1 = (short) a1;
        long d1 = (long) s1;
        System.out.println(a1 +" "+ s1 +" "+ d1);

        //Преобразование типов ЯВНОЕ ОБРАТНОЕ   (могут быть  ошибки когда число слишком большое)
        long a2 = 1276343434;
        short s2 = (short) a2;
        int d2 = (int) s2;
        byte r2 = (byte) d2;
        System.out.println(a2 +" "+ s2 +" "+ d2+" "+ r2);


        //printBinary(a, 16);


    }
    private static void printBinary(long value, int size){ //берется количество байт, и размер В БИТАХ,
        for (int i = size -1; i >= 0; i--){
            long mask = 1L << i;               //в случае long не забываем поставить L
            long result = (mask & value) >> i;
            System.out.print(result); //печатает в консоль значение бита с лева направо
        }
        System.out.println();

        //System.out.println(Long.toBinaryString(value));
    }
}
