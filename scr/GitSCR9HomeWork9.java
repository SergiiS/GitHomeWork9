import java.util.Scanner;

public class GitSCR9HomeWork9 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Відгадай ціле число, яке \"загадав\" комп'ютер у діапазоні від 0 до 10. " +
                "У тебе є 3 спроби.");
        int range = 10;
        int computerRandom = (int)(Math.random() * range);
        for (int counterTry = 3; counterTry > 0; --counterTry){
            int inputNumber = scanner.nextInt();
            if (inputNumber == computerRandom) {
                System.out.println("Ви вгадали число");
            }else {

                System.out.println("Ви не вгадали число.");
                }

            }

        }
    }

