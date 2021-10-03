package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    // Properties
    private String quizName;
    private int numberOfQuestions;
    private Player player;
    private QuestionsAnswers questions;

    // Constructor
    public Quiz(String quizName, int numberOfQuestions, QuestionsAnswers questions) {
        this.quizName = quizName;
        this.numberOfQuestions = numberOfQuestions;
        this.questions = questions;

        System.out.println("Welcome to this " + this.getQuizName() + " Quiz!");
        System.out.println("There are " + this.getNumberOfQuestions() + " questions in this quiz.");
        System.out.println("You will be provided with three options.  Please answer by typing a, b or c.");
        this.introToQuiz();
    }

    private void introToQuiz() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("First of all, what is your first name?");

        String playerName = myScanner.nextLine();
        this.player = new Player(playerName);

        System.out.println("Let's begin " + playerName + "...");

        takeQuiz(this.getQuestions(), player);
    }

    public static void takeQuiz(QuestionsAnswers qa, Player player) {
        Scanner myScanner = new Scanner(System.in);

        String [] questions = qa.getQuestions();

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

    // Methods - getters for quiz class
    public String getQuizName() {
        return quizName;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public QuestionsAnswers getQuestions() {
        return questions;
    }
}
