package model;

public class ClientCustomised {
    private int clientId;
    private String name;
    private String phoneNumber;
    private int onlinePortalId;
    private String enterSearch;

    public ClientCustomised(int clientId, String name, String phoneNumber, int onlinePortalId, String enterSearch) {
        this.clientId = clientId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.onlinePortalId = onlinePortalId;
        this.enterSearch = enterSearch;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getOnlinePortalId() {
        return onlinePortalId;
    }

    public void setOnlinePortalId(int onlinePortalId) {
        this.onlinePortalId = onlinePortalId;
    }

    public String getEnterSearch() {
        return enterSearch;
    }

    public void setEnterSearch(String enterSearch) {
        this.enterSearch = enterSearch;
    }
}
