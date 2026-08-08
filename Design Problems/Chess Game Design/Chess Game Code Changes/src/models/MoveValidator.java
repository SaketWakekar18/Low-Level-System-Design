package models;

import constants.PieceColor;

import java.util.List;

public class MoveValidator {
    public boolean validateMoves(Board board, Move move) {
        return false;
    }

    public boolean isCheckMate(Board board, PieceColor color) {
        return false;
    }

    public boolean isStalemate(Board board, PieceColor color) {
        return false;
    }

    public boolean isKingSafe(Board board, PieceColor color) {
        return false;
    }

    public boolean isCastlingAllowed(Board board, Move move) {
        return false;
    }

}

