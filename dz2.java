package otus;

import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        int correctCount = 0;
        int wrongCount = 0;
        Scanner scanner = new Scanner(System.in);
        String[] questions = {"Эта марка машины носит женское имя. Она была названа в честь дочери австрийского консула.",
                "С какого года выпускается Волга?",
                "Какой завод выпускал автомобили марки Волга?"};
        int[] correctAnswers = {Integer.parseInt("3"), Integer.parseInt("2"), Integer.parseInt("1")};
        String[][] answerOptions = {{"1.Toyota;", "2.Nissan Silvia;", "3.Mercedes;"},
                {"1.1967;", "2.1957;", "3.1959;"},
                {"1.Горьковский;", "2.Уральский;", "3.Волжский;"}};

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Вопрос: " + questions[i]);
            for (int j = 0; j < answerOptions.length; j++) {
                System.out.println(answerOptions[i][j]);
            }
            int userAnswer = scanner.nextInt();
            if (userAnswer == correctAnswers[i]) {
                correctCount++;
            } else {
                wrongCount++;
            }
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount + ".");
    }
}