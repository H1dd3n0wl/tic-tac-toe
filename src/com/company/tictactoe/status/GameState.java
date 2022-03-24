package tictactoe.status;

public enum GameState {
    GAME_IS_NOT_STARTED("Game is not started"),
    GAME_IN_PROGRESS("Game in progress"),
    O_WINS("O wins"),
    X_WINS("X wins"),
    DRAW("Draw");

    GameState(String state) {
        this.state = state;
    }

    private final String state;

    public String getState() {
        return state;
    }
}
