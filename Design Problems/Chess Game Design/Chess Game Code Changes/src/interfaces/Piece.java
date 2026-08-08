package interfaces;

import constants.PieceColor;
import models.Board;
import models.Box;

public abstract class Piece {
    PieceColor color;
    boolean hasMoved;

    public abstract boolean canMove(Board board, Box start, Box end);
}
