package models;

import interfaces.Piece;

public class Queen extends Piece {

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        return false;
    }
}
