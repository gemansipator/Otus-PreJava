package javalanguage.syntax;

public class Main {
    public static void main(String[] args) {
        //&,|, ^
        //<<, >>, ~

        int a = 1;
        printBinary(a, 32); // результат: 00000000000000000000000000000001

        int b = ~a;   //оператор ОТРИЦАНИЯ заменяет числа на противоположные. О на 1 и 1 на 0
        printBinary(b,32); // результат: 11111111111111111111111111111110


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
