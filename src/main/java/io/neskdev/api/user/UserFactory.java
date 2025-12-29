package io.neskdev.api.user;

import org.bson.Document;

public interface UserFactory {
    User fromJson(String json);
    User fromDocument(Document document);
}
