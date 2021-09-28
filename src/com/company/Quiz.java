package com.company;

public class Quiz {
    private String quizName;
    private int numberOfQuestions;

    public Quiz(String quizName, int numberOfQuestions) {
        this.quizName = quizName;
        this.numberOfQuestions = numberOfQuestions;
        System.out.println("Welcome to this " + getQuizName() + " Quiz!");
        System.out.println("There are " + getNumberOfQuestions() + " questions in this quiz.");
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }
}
