package com.company;

import java.util.ArrayList;

public class Player {
    private String playerName;
    private ArrayList<String> playerAnswers = new ArrayList<>();

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public ArrayList<String> getPlayerAnswers() {
        return playerAnswers;
    }

    public void setPlayerAnswers(ArrayList<String> playerAnswers) {
        this.playerAnswers = playerAnswers;
    }

    public void appendAnswer(String playerAnswer) {
        this.playerAnswers.add(playerAnswer);
    }
}
