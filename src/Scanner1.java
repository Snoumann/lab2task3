/*Створити програму, яка буде повідомляти, чи є ціле число,
введене користувачем з клавіатури, парне або непарне.
Якщо користувач введе не ціле число, то вивести повідомлення про помилку.*/
import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        //потоком вводу необхідно створити об класу Scanner,
        //потік вводу (клавіатура) System.in.
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Введіть ціле число");

        if (sc.hasNextInt()) {
            i = sc.nextInt();
            if (i%2 == 0) {
                System.out.print("число " + i + " парне");
            } else {
                System.out.print("число " + i + " не парне");
            }
        } else {
            System.out.print("Ви ввели не ціле число");
        }
    }
}
