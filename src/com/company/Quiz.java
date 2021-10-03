package com.company;

import java.util.Scanner;

import static com.company.Main.takeQuiz;

public class Quiz {
    // Properties of a quiz
    private String quizName;
    private int numberOfQuestions;
    private Player player;
    private QuestionsAnswers questions;

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
