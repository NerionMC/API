package io.neskdev.api.rank;


import io.neskdev.api.utils.GsonProvider;
import org.bson.Document;

import java.util.Set;
import java.util.function.Predicate;

public interface Rank {

    String getName();

    String getPrefix();

    int getPower();

    boolean isDefaultRank();

    Set<String> getPermissions();

    default boolean hasPermission(String permission) {
        return getPermissions().contains(permission);
    }

    default Predicate<String> hasPermissionPredicate() {
        return getPermissions()::contains;
    }

    Document toDocument();
    String toJson();

    static Rank fromDocument(Document document) {
        return (Rank) fromJson(document.toJson());
    }

    static Object fromJson(Object o) {
        return GsonProvider.GSON.fromJson(GsonProvider.GSON.toJson(o), o.getClass());
    }
}