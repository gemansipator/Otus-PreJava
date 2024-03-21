package javalanguage.syntax;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world II!");
        //byte (1 байт или 8 бит), short (2 байта), int (4 байта или 32 бита), long  (8 байт)
        //boolean (1), char (2), float (4), double (8)


        boolean a = true;
        System.out.println("a = " + a);
        boolean b = true;
        System.out.println("b = " + b);
        //printBinary(a, 64);

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
