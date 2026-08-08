package models;

import java.util.ArrayList;
import java.util.List;

public class MoveHistory {
    private List<Move> moves = new ArrayList<>();

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

}
