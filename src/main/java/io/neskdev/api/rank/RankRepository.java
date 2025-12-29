package io.neskdev.api.rank;

import java.util.List;

public interface RankRepository {

    Rank getRank(String name);

    List<Rank> getRanks();

    void addRank(Rank rank);

    void deleteRank(Rank rank);

}