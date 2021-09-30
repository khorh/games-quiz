package com.company;

import java.util.Scanner;

public class Quiz {
    // Properties of a quiz
    private String quizName;
    private int numberOfQuestions;

    // Links to the QuestionAnswers class
    private QuestionsAnswers questions;

    public Quiz(String quizName, int numberOfQuestions, QuestionsAnswers questions) {
        this.quizName = quizName;
        this.numberOfQuestions = numberOfQuestions;
        this.questions = questions;

        System.out.println("Welcome to this " + getQuizName() + " Quiz!");
        System.out.println("There are " + getNumberOfQuestions() + " questions in this quiz.");
        System.out.println("You will be provided with three options.  Please answer by typing a, b or c.");
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
