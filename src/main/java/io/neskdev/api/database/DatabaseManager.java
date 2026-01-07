package io.neskdev.api.database;

import com.mongodb.client.MongoClient;
import redis.clients.jedis.Jedis;

public interface DatabaseManager {
    Jedis getJedis();
    MongoClient getMongoClient();
    MaintenanceSystem getMaintenanceSystem();
}
