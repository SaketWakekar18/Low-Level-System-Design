package models;

import interfaces.ChessCommand;

public class MoveCommand implements ChessCommand {

    private ChessGame chessGame;
    private Move move;

    public MoveCommand(ChessGame chessGame, Move move) {
        this.chessGame = chessGame;
        this.move = move;
    }

    @Override
    public void execute() {
        chessGame.playMove(move);
    }
}
