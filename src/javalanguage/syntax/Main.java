package javalanguage.syntax;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world II!");
        //byte (1 байт или 8 бит), short (2 байта), int (4 байта или 32 бита), long  (8 байт)

        //NT_MIN	Минимальное значение для переменной типа int.	-2147483647 - 1
        //INT_MAX	Максимальное значение для переменной типа int.	2147483647
        int a = 0;
        System.out.println("a = " + a);
        printBinary(a, 32);
        a = 22;
        System.out.println("a = " + a);
        printBinary(a, 32);
        a = 2147483647;     // можно число написать так: 2_147_483_647
        System.out.println("a = " + a);
        printBinary(a, 32);
        a = Integer.MAX_VALUE;    //максимальное число в Int
        System.out.println("a = " + a);
        printBinary(a, 32);
    }
    private static void printBinary(int value, int size){ //берется количество байт, и размер В БИТАХ,
        for (int i = size -1; i >= 0; i--){
            long mask = 1 << i;
            long result = (mask & value) >> i;
            System.out.print(result); //печатает в консоль значение бита с лева направо
        }
        System.out.println();

        //System.out.println(Long.toBinaryString(value));
    }
}
