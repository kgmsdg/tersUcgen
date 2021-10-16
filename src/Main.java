import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        int basamak = inp.nextInt();

        for (int i = 1; i <= basamak; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (2 * basamak) - (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

