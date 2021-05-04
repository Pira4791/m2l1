import java.util.Scanner;

public class mod2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int num = scanner.nextInt();
        int num1 = num / 1000;
        int num2 = num / 100 % 10;
        int num3 = num / 10 % 10;
        int num4 = num % 10;

        System.out.println(num1 * num2 * num3 * num4);

    }
}
