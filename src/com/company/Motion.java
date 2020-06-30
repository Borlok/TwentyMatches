package com.company;

public class Motion {
    private String playerName;
    private int allMatches = 20;
    private int getValueOfTackedMatches;

    public void setPlayerMove(String name, int numberOfTackedMatches) {
        playerName = name;
        getValueOfTackedMatches = numberOfTackedMatches;
        calculateRemainingMatchesAndVerifyWinner();
    }

    private void calculateRemainingMatchesAndVerifyWinner() {
        allMatches -= getValueOfTackedMatches;
        verifyWinner();
    }

    private void verifyWinner() {
        if (allMatches <= 1) {
            UserInterface.continueGame();
            UserInterface.endGame();
            System.exit(0);
        }
        UserInterface.continueGame();
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getAllMatches() {
        return allMatches;
    }

    public int getMatchesNumber() {
        return getValueOfTackedMatches;
    }
}
