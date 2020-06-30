package com.company;

public class GameLogic {
    private final AI ai;
    private final Player player;
    private final Motion motions = new Motion();

    public GameLogic() {
        ai = new AI(motions);
        player = new Player();
    }

    public Motion startNewGame() {
        return motions;
    }

    public void continueGame() {
        motions.setPlayerMove(ai.getName(), ai.getMoveAI());
        motions.setPlayerMove(player.getName(), player.getPlayerMove());
        continueGame();
    }

}
