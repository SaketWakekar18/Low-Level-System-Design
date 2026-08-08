package models;

import interfaces.Piece;

public class Rook extends Piece {

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        return false;
    }
}
