import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество метров");
        double metrs = scanner.nextDouble();
        double sant = metrs * 100;
        System.out.println("Сантиметров в метре:" + sant);
        double dec = metrs * 10;
        System.out.println("Дециметров в метре:" + dec);
        double mill = metrs * 1000;
        System.out.println("Миллиметров в метре:" + mill);
        double milles = metrs / 1600;
        System.out.println("Миль в метре:" + milles);


    }
}


