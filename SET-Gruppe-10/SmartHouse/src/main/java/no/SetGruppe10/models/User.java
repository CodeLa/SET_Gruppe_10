package no.SetGruppe10.models;

public class User {
    private int id;
    private String name;
    private String adminStatus;

    public User(int id, String name, String adminStatus) {
        this.id = id;
        this.name = name;
        this.adminStatus = adminStatus;
    }
    @Override
    public String toString(){
        return "Name: " + name + "\nID: " + id + "\nStatus: " + adminStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    public String AdminStatus() {
        if (adminStatus == "admin") {
           return "You have access to all the features";
        } else if(adminStatus == "non-admin"){
            return "You have limited access";
        }
        else {
            return null;
        }

    }



}
