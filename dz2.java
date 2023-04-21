package otus;

import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        int correctCount = 0; int wrongCount = 0;
        Scanner scan = new Scanner(System.in);
        String[] questions = new String[3];
        questions[0] = "Какие звуки издает кошка?";
        questions[1] = "Какие звуки издает собака?";
        questions[2] = "Какие звуки издает корова?";
        String[] quest = new String[] {"Му", "Мяу", "Гав"};
        System.out.print("Вопрос 1: " + questions[0] + "\nОтвет 1: " + quest[0] + "\nОтвет 2: " + quest[1] + "\nОтвет 3: " + quest[2] + "\n\nВведите ваш ответ цифрой");
        int scan1 = scan.nextInt();
        if (scan1 == 2) {
            correctCount += 1;
        } else {
            wrongCount += 1;
        }
        System.out.print("Вопрос 2: " + questions[1] + "\nОтвет 1: " + quest[0] + "\nОтвет 2: " + quest[1] + "\nОтвет 3: " + quest[2] + "\n\nВведите ваш ответ цифрой");
        int scan2 = scan.nextInt();
        if (scan2 == 3) {
            correctCount += 1;
        } else {
            wrongCount += 1;
        }
        System.out.print("Вопрос 3: " + questions[2] + "\nОтвет 1: " + quest[0] + "\nОтвет 2: " + quest[1] + "\nОтвет 3: " + quest[2] + "\n\nВведите ваш ответ цифрой");
        int scan3 = scan.nextInt();
        if (scan3 == 1) {
            correctCount += 1;
        } else {
            wrongCount += 1;
        }
        System.out.println("Результат: правильно " + correctCount + "\nнеправильно " + wrongCount);
    }
}
