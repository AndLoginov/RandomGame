import java.util.Scanner;
import java.util.Random;

public class RandomGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Добро пожаловать на игру!");
        System.out.println("Я загадал число от 1 до 100, отгадай его");

        while (true){
            System.out.print("Ваша попытка: ");
            int tr = scanner.nextInt();
            attempts++;

            if (tr == secret){
                System.out.println("Вы угадали!!!");
                break;
            } else if (tr > secret){
                System.out.println("Неправильно, меньше");
            } else {
                System.out.println("Неправильно, больше");
            }
        }
        scanner.close();
    }
}
