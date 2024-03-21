package javalanguage.syntax;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world II!");
    }
    private static void printBinary(byte value, int size){
        for (int i = size -1; i >= 0; i--){
            long mask = 1 << i;
            long result = (mask & value) >> i;
            System.out.println(result);
        }
        System.out.println();

        //System.out.println(Long.toBinaryString(value));
    }
}
