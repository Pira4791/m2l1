import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String changeling = scanner.nextLine();
        for (int i = changeling.length() - 1;
        i >= 0;
        i--){
            System.out.print(changeling.charAt(i));
        }
    }
}