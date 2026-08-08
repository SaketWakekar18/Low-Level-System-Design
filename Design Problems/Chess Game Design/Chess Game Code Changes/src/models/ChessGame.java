package models;

import constants.GameStatus;
import interfaces.ChessCommand;

public class ChessGame {
    private Board board;
    private Player whitePlayer;
    private Player blackPlayer;
    private MoveHistory moveHistory;
    private MoveValidator moveValidator;
    private GameStatus gameStatus;

    public ChessGame(Board board, Player whitePlayer, Player blackPlayer, MoveHistory moveHistory, MoveValidator moveValidator, GameStatus gameStatus) {
        this.board = board;
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
        this.moveHistory = moveHistory;
        this.moveValidator = moveValidator;
        this.gameStatus = gameStatus;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getWhitePlayer() {
        return whitePlayer;
    }

    public void setWhitePlayer(Player whitePlayer) {
        this.whitePlayer = whitePlayer;
    }

    public Player getBlackPlayer() {
        return blackPlayer;
    }

    public void setBlackPlayer(Player blackPlayer) {
        this.blackPlayer = blackPlayer;
    }

    public MoveHistory getMoveHistory() {
        return moveHistory;
    }

    public void setMoveHistory(MoveHistory moveHistory) {
        this.moveHistory = moveHistory;
    }

    public MoveValidator getMoveValidator() {
        return moveValidator;
    }

    public void setMoveValidator(MoveValidator moveValidator) {
        this.moveValidator = moveValidator;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void startGame() {

    }

    public void displayResult() {

    }

    public void getStatus() {

    }

    public void makeMove(Box start, Box end) {
        Move move = new Move();

        ChessCommand chessCommand = new MoveCommand(this, move);
        chessCommand.execute();
    }

    public void playMove(Move move) {

    }
}
