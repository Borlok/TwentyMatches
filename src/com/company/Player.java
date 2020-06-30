package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    private final Scanner getMatchesNumberFromPlayer;
    private final String name;
    private int tackedMatches;

    public Player() {
        name = "Player";
        getMatchesNumberFromPlayer = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public int getPlayerMove() {
        return getValidNumber();
    }

    private int getValidNumber() {
        try {
            tackedMatches = getMatchesNumberFromPlayer.nextInt();
            if (tackedMatches < 1 || tackedMatches > 3) {
                System.out.println("неправильное значение, попробуй еще раз");
                getPlayerMove();
            }
        } catch (InputMismatchException e) {
            notANumberException(e);
        }
        return tackedMatches;
    }

    private void notANumberException(InputMismatchException e) {
        e.getStackTrace();
        System.out.println("Введена не цифра, будьте внимательней");
        getMatchesNumberFromPlayer.skip("\\w*");
        getPlayerMove();
    }


}
