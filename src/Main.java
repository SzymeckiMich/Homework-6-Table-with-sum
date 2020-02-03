import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] table = new int[5];
        for (int i = 0; i < table.length; i++) {
            System.out.println("Podaj liczbę: " + (i + 1) + "/" + table.length + "\n");
            table[i] = scanner.nextInt();
        }
        double sum = 0;

        for (int i = 0; i < table.length; i++, i++) {
            sum += table[i];
        }
        System.out.println("Suma pierwszej, trzeciej i piątej liczby to: " + sum);
    }
}
