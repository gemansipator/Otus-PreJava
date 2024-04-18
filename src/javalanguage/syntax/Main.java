package javalanguage.syntax;

public class Main {
    public static void main(String[] args) {
        // &&    "И"
        // ||    "ИЛИ"
        // !     "ОТРИЦАНИЕ"





    }
    private static void printBinary(long value, int size){ //берется количество байт, и размер В БИТАХ,
        for (int i = size -1; i >= 0; i--){
            long mask = 1L << i;               //в случае long не забываем поставить L
            //сначала мы создали маску у которой только один бит выставлен в единицу, тот бит, который в исследуемой
            // ячейке
            long result = (mask & value) >> i; //потом сравнили маску с исследуемым значением и сдвинули вправо результат
            // чтобы получить число для вывода на экран
            System.out.print(result); //печатает в консоль значение бита с лева направо
        }
        System.out.println();

        //System.out.println(Long.toBinaryString(value));
    }
}
