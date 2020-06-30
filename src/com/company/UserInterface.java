package com.company;

public class UserInterface {
    private static Motion motions;

    public void startGame() {
        System.out.println("Приветствуем вас в игре 20 спичек. Вы играете с опонентом, каждый игрок " +
                           "\nвытягивает по 1, 2 или 3 спички. Кому достанется последняя спичка - тот проиграл." +
                           "\nПервым начинает компьютер." +
                           "\n| | | | | | | | | | | | | | | | | | | |");

        GameLogic gameLogic = new GameLogic();
        motions = gameLogic.startNewGame();
        gameLogic.continueGame();
    }

    public static void continueGame() {
        System.out.println(motions.getPlayerName() + " взял "
                           + motions.getMatchesNumber() + " спички, осталось "
                           + motions.getAllMatches());

        for (int i = 0; i < motions.getAllMatches(); i++) {
            System.out.print("| ");
        }
        System.out.println("");
    }

    public static void endGame() {
        System.out.println("Победил " + motions.getPlayerName() + "!!!");
    }


}
