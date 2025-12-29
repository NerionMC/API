package io.neskdev.api.user;

import org.bson.Document;
import io.neskdev.api.rank.Rank;

import java.util.List;
import java.util.UUID;

public interface User {
    UUID getUniqueId();

    String getName();
    void setName(String var);

    long getId();

    String getServer();
    void setServer(String var);
    boolean isOnline();

    int getRunes();
    void setRunes(int var);

    int getDivines();
    void setDivines(int var);

    List<Rank> getRanks();
    Rank getRank();
    boolean hasPermission(String var);

    void sendMessage(String... messages);

    void saveCache();
    void deleteCache();
    void saveMongo();

    Document toDocument();
    String toJson();
}
