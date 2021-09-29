package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        introToQuiz();

//        Question q1 = new Question("Who won the ladies US Open Final in 2021?", "emma radacanu");
//        System.out.println(q1.getQuestion());
//        myScanner.nextLine();
//        String a1 = myScanner.nextLine();
//
//        int score = 0;
//        if(a1.equals(q1.getAnswer())) {
//            score += 1;
//        }
//        System.out.println(playerName + ", your score is " + score);

    }

    public static void introToQuiz() {
        Quiz tennis = new Quiz("Tennis", 5);
        System.out.println(tennis);

        Scanner myScanner = new Scanner(System.in);

        System.out.println("First of all, what is your name?");
        String playerName = myScanner.nextLine();
        Player player = new Player(playerName);

        System.out.println("Let's begin...");

        // new Questions() as there is no constructor, so you do not need to provide it with values
        questionsAnswers(new Questions());
    }

    public static void questionsAnswers(Questions question) {
        String [] questions = question.getQuestions();

        Scanner myScanner = new Scanner(System.in);

        int i = 0;
        while (i < questions.length) {
            System.out.println(questions[i]);
            String playerAnswer = myScanner.nextLine();
            i++;
        }
    }
}
