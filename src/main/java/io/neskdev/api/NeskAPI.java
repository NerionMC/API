package io.neskdev.api;

import io.neskdev.api.lobby.Lobby;
import io.neskdev.api.lobby.LobbyManager;
import io.neskdev.api.database.DatabaseManager;
import io.neskdev.api.rank.RankRepository;

public abstract class NeskAPI {

    private static NeskAPI instance;

    public static NeskAPI get() {
        return instance;
    }

    public static void set(NeskAPI instance) {
        NeskAPI.instance = instance;
    }

    public abstract RankRepository getRankRepository();

    public abstract DatabaseManager getDatabaseManager();

    public abstract LobbyManager getLobbyManager();

    public abstract Lobby getLobby();
}
