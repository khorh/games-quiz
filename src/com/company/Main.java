package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Quiz general = new Quiz("Tennis", 5);
        System.out.println(general);

        Scanner myScanner = new Scanner(System.in);

        System.out.println("First of all, what is your name?");
        String playerName = myScanner.next();
        Player player = new Player(playerName);

        System.out.println("Let's begin...");

        Question q1 = new Question("Who won the ladies US Open Final in 2021?", "Emma Radacanu");
        System.out.println(q1.getQuestion());
        String a1 = myScanner.next();
    }
}
