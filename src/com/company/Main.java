package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        introToQuiz();
    }

    public static void introToQuiz() {
        Quiz tennis = new Quiz("Tennis", 5, new QuestionsAnswers());
        System.out.println(tennis);

        Scanner myScanner = new Scanner(System.in);

        System.out.println("First of all, what is your first name?");

        String playerName = myScanner.nextLine();
        Player player = new Player(playerName);

        System.out.println("Let's begin " + player.getPlayerName() + "...");

        takeQuiz(tennis.getQuestions(), player);
    }

    public static void takeQuiz(QuestionsAnswers qa, Player player) {
        String [] questions = qa.getQuestions();

        Scanner myScanner = new Scanner(System.in);

        // while loop is better than a for loop as it allows for answers to be validated
        int i = 0;

        while (i < questions.length) {
            System.out.println(questions[i]);
            String playerAnswer = myScanner.nextLine().toLowerCase();

            if (playerAnswer.equals("a") || playerAnswer.equals("b") || playerAnswer.equals("c")) {
                player.appendAnswer(playerAnswer);
                i++;
            } else {
                System.out.println("! Error in your answer. Please type either a, b or c");
            }
        }

        showScore(new QuestionsAnswers(), player);
    }

    public static void showScore(QuestionsAnswers qa, Player player) {
        String [] actualAnswers = qa.getAnswers();
        ArrayList<String> playerAnswers = player.getPlayerAnswers();

        int score = 0;
        for (int j = 0; j < actualAnswers.length; j++) {
            if (actualAnswers[j].equals(playerAnswers.get(j))) {
                score += 1;
            }
        }

        System.out.println(player.getPlayerName() + ", your score is " + score + "/" + actualAnswers.length);

        endQuiz();
    }

    public static void endQuiz() {
        System.out.println("This is the end of the quiz!");
    }
}
