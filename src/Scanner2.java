/*Створити програму, яка буде виводити на екран менше за модулем
 з трьох введених користувачем дробових чисел*/
import java.util.Scanner;

import static java.lang.Math.*;

public class Scanner2 {

    public static void main(String[] args) {

        double number = 0;
        double min = number;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Введіть дробове число(" + i + "): ");

            //перевірка на дробове
            if (sc.hasNextDouble()) {
                if (i == 0){
                    //присвоюємо мін значенню знвчення 1ого числа
                    min = abs(sc.nextDouble());
                } else {
                    number = abs(sc.nextDouble());
                    if (number < min) {
                        min = number;
                    }
                }
            } else {
                System.out.print("Ви ввели не дробове число");
            }
        }
        System.out.print("Найменше з 3ьох чисел за модулем: " + min);
    }
}
