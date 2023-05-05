import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minInt, maxInt;
        System.out.println("Введите минимальное число: ");
        if (scan.hasNextInt()) {
            minInt = scan.nextInt();
            System.out.println("Введите максимальное число: ");
            if (scan.hasNextInt()) {
                maxInt = scan.nextInt();

                if (minInt < maxInt) {
                    for (int i = minInt + 1; i < maxInt; i++) {
                        System.out.println(i);
                    }
                } else {
                    for (int i = maxInt + 1; i < minInt; i++) {
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println("Это не число!");
                scan.close();
            }
        } else {
            System.out.println("Это не число!");
            scan.close();
        }
    }
}
