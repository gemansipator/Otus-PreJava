package javalanguage.syntax;

public class Main {
    public static void main(String[] args) {
        //&,|, ^
        //<<, >>, ~

        int a = 5;
        printBinary(a, 32); // результат: 00000000000000000000000000000101

        int b = a << 3;   //оператор сдвига << сдвигает влево все биты в переменной а на указанное после оператора <<
        // количество ячеек
        printBinary(b,32); // результат: 00000000000000000000000000101000

        int с = a >> 1;   //оператор сдвига << сдвигает dghfdj все биты в переменной а на указанное после оператора <<
        // количество ячеек
        printBinary(с,32);  // результат: 00000000000000000000000000000010  - единица, вышедшая за рамки, пропадает





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
