/*чи є введене користувачем слово з п'яти букв, паліндромом (наприклад «ротор»).
 Якщо введено слово не з 5 букв, то повідомити про помилку*/
import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть слово з 5ти букв: ");
        String word;
        word = sc.nextLine();
        word.toUpperCase();
        boolean palindrome = true;

        if (word.length() == 5) {
            StringBuffer drow = new StringBuffer(word).reverse();


            for(int count = 0; count < word.length(); count++){
                if(word.charAt(count) != drow.charAt(count)){
                    palindrome = false;
                }
            }

        } else {
            System.out.print("Помилка! Ви ввели слово не з 5ти букв");
        }

        if (palindrome == true) {
            System.out.println("Слово " + word + " є поліндромом");
        } else {
            System.out.println("Слово " + word + "не є поліндромом");
        }
    }
}
