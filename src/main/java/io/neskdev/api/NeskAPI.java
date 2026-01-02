package io.neskdev.api;

import io.neskdev.api.lobby.Lobby;
import io.neskdev.api.lobby.LobbyManager;
import lombok.Getter;
import lombok.Setter;
import io.neskdev.api.database.DatabaseManager;
import io.neskdev.api.rank.RankRepository;

public interface NeskAPI {

    RankRepository getRankRepository();

    DatabaseManager getDatabaseManager();

    LobbyManager getLobbyManager();
    Lobby getLobby();

    static NeskAPI getProvider() {
        return Provider.getProvider();
    }

    static void setProvider(NeskAPI api) {
        Provider.setProvider(api);
    }

    class Provider {
        @Getter @Setter
        private static NeskAPI provider;
    }
}
