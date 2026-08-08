package models;

import java.util.List;

public class ChessGameSystem {
    private List<Player> players;
    private List<Admin> admins;
    private List<ChessGame> activeGames;

    private static volatile ChessGameSystem INSTANCE = null;

    private ChessGameSystem() {

    }

    public synchronized static ChessGameSystem getInstance() {
        if (INSTANCE == null) {
            synchronized (ChessGameSystem.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ChessGameSystem();
                }
            }
        }
        return INSTANCE;
    }

    public void createGame() {

    }

    public void removeGame() {
    }
}
