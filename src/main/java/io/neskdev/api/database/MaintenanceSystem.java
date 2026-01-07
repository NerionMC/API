package io.neskdev.api.database;

public interface MaintenanceSystem {

    void isMaintenance();
    void setMaintenance();
    void addAllowedPlayer();
    void removeAllowedPlayer();
    void isAllowed();

}
