package javalanguage.syntax;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world II!");
        //byte (1 байт), short (2), int (4), long  (8)
        byte a = 1;
        printBinary(a, 8);  //длину (8 бит в одном байте) ставим мы
        a = 64;   //максимум 127
        printBinary(a, 8);
        a = 127;   //максимум 127
        printBinary(a, 8);
        a = -1;   //минимум  -128
        printBinary(a, 8);
        a = -128;   //минимум  -128
        printBinary(a, 8);
    }
    private static void printBinary(byte value, int size){ //берется количество байт, и размер В БИТАХ,
        for (int i = size -1; i >= 0; i--){
            long mask = 1 << i;
            long result = (mask & value) >> i;
            System.out.print(result); //печатает в консоль значение бита с лева направо
        }
        System.out.println();

        //System.out.println(Long.toBinaryString(value));
    }
}
