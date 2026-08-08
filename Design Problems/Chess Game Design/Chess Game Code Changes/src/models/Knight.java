package models;

import interfaces.Piece;

public class Knight extends Piece {

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        return false;
    }
}
