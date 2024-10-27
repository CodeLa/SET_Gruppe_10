package no.SetGruppe10.models;

public class User {
    private String id;
    private String name;
    private String adminStatus;

    public User(String id, String name, String adminStatus) {
        this.id = id;
        this.name = name;
        this.adminStatus = adminStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
    }


}
