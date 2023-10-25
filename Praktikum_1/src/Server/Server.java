package Server;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

public class Server implements TicTacToeAService {
    private int game_ID;
    private String opponent_name;


    @Override
    public HashMap<String, String> findGame(String clientName) throws RemoteException {
        return null;
    }

    @Override
    public String makeMove(int x, int y, String gameId) throws RemoteException {
        return null;
    }

    @Override
    public ArrayList<String> fullUpdate(String gameId) throws RemoteException {
        return null;
    }
}
