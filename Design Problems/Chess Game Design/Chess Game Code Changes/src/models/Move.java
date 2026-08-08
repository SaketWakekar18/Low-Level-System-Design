package models;

import interfaces.Piece;

public class Move {
    private Piece piece;
    private Box start;
    private Box end;
    private Player player;
    private Piece isKilled;

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Box getStart() {
        return start;
    }

    public void setStart(Box start) {
        this.start = start;
    }

    public Box getEnd() {
        return end;
    }

    public void setEnd(Box end) {
        this.end = end;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Piece getIsKilled() {
        return isKilled;
    }

    public void setIsKilled(Piece isKilled) {
        this.isKilled = isKilled;
    }
}
