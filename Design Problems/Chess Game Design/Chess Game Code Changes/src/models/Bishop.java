package models;

import interfaces.Piece;

public class Bishop extends Piece {
    @Override
    public boolean canMove(Board board, Box start, Box end) {
        return false;
    }
}
