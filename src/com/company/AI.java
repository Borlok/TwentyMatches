package com.company;

public class AI {
    private String name;
    private Motion motion;

    public AI(Motion motion) {
        name = "Computer";
        this.motion = motion;
    }

    public int getMoveAI() {
        if (motion.getAllMatches() > 15) {
            return 3;
        } else if (motion.getAllMatches() <= 15 && motion.getAllMatches() > 12) {
            return motion.getAllMatches() - 13;
        } else if (motion.getAllMatches() <= 12 && motion.getAllMatches() >= 10) {
            return motion.getAllMatches() - 9;
        } else if (motion.getAllMatches() == 9) {
            return 1;
        } else if (motion.getAllMatches() <= 8 && motion.getAllMatches() > 5) {
            return motion.getAllMatches() - 5;
        } else {
            return motion.getAllMatches() - 1;
        }
    }

    public String getName() {
        return name;
    }

}
