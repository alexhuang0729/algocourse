package algos;

public class MultiplicationTable {
    public static void table(int size) {
        for (int vertical = 0; vertical < size+1; vertical++) {
            for (int horizontal = 0; horizontal < size+1; horizontal++) {
                System.out.print(vertical*horizontal + " ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        table(12);
    }
}
