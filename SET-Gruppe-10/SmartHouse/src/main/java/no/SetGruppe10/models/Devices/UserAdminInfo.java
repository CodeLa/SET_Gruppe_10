package no.SetGruppe10.models.Devices;

//Denne er får info om brukerene
//Hvilket roller hver bruker har ved hjelp av funkjonen adminStatus
/*/
  for videreutvikling av userAdminInfo kan man gjøre sånn at hvis man er admin
  så kan man ha tilgang og ikke-admin må spørre admin om tilatelse
 */

public class UserAdminInfo {
    private int id;
    private String name;
    private String adminStatus;

    public UserAdminInfo(int id, String name, String adminStatus) {
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
