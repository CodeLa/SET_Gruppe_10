package no.SetGruppe10;
import no.SetGruppe10.models.Devices.*;

public class Main {
    public static void main(String[] args) {

        //opprettet Brukere
        UserAdminInfo user1  = new UserAdminInfo(23522, "Jon Doe", "admin");
        UserAdminInfo user2 = new UserAdminInfo(10846, "Jacob Doe", "non-admin");
        UserAdminInfo user3 = new UserAdminInfo(45646, "Carly Joe", "non-admin");
        UserAdminInfo user4 = new UserAdminInfo(32565, "Kelly bardaw", "admin");

        //Opretter en Smart Dør
        SmartDoorController houseDoor = new SmartDoorController("UnitDoor", true, true, true);
        //oppretter en enhet for temprature
        TempratureAdjuster tempratureAdjusterUnit1 = new TempratureAdjuster("UnitTemprature1",
                true, 25);
        //Opretter en Lys enhet som skal være i stua
        LightControll livingRoomLights = new LightControll("LD-lIGHTS", true, false);
        //Oppretter en Ovn Enhet
        OvenActiveDetecter firstOven = new OvenActiveDetecter("Ovn-enehet", true,true);

        GasLeakDetector gasDetecterUnit = new GasLeakDetector("Gas Detect - Enhet", true, 802);

        //Denne er ment for å vise hvordan funksjonen AdminStatus funker
        System.out.println("Brukerer som er Admin og ikke-admin");
        System.out.println();
        System.out.println(user1 + " ----> " + user1.AdminStatus());
        System.out.println();
        System.out.println(user2 + " ----> " + user2.AdminStatus());
        System.out.println();
        System.out.println(user3 + " ----> " + user3.AdminStatus());
        System.out.println();
        System.out.println(user4 + " ----> " + user4.AdminStatus());


        System.out.println();
        System.out.println("--Temprature Device--");
        System.out.println();
        //Denne skrivet ut informasjon om Enheten
        System.out.println(tempratureAdjusterUnit1);
        System.out.println("---------------------");
        //Denne funksjonen(ChooseTemprature) gjør det mulig for brukeren å velge Tempraturen i huset
        System.out.println(tempratureAdjusterUnit1.ChooseTemprature(24.0));
        System.out.println();
        //Denne funksjonen (turnDeviceOn) gjør det mulig for brukeren å slå på enheten
        System.out.println(tempratureAdjusterUnit1.turnDeviceOn());
        System.out.println();
        //Denne funksjonen (turnDeviceOff) gjør det mulig for brukeren å slav av enheten
        System.out.println(tempratureAdjusterUnit1.turnDeviceOff());


        System.out.println();
        System.out.println("--Dør-Enheten--");
        System.out.println(houseDoor);
        System.out.println("---------------");
        //Denne Funksjonen (Close)gjør det mulig for å låse døren
        System.out.println("Funksjon for å låse døren ---> " + houseDoor.Close());
        //Denne funkjonen(open) gjør det mulig å åpne døren
        System.out.println("Funksjon for å åpne døren ---> " + houseDoor.open());
        //Denne funksjonen (deviceIsOpenSendAlert)sender Alarm basert på verdiene hvis døren er åpen og ingen er hjemme osv.
        System.out.println("Funksjon for å sende Alarm ---> " + houseDoor.deviceIsOpenAlert());

        System.out.println();
        System.out.println("--Ovn-Enhet--");
        System.out.println(firstOven);
        System.out.println();
        //Denne funksjonen slår av ovnen
        System.out.println("Funksjonen slår av ovnen ---> " + firstOven.turnDeviceOff());
        //Denne Funksjonen sender en varsel hvis ovnen er på når ingen er tilstede
        System.out.println("Funksjonen sender en varsel --->" + firstOven.safetyAlert());

        System.out.println();
        System.out.println("--Lys-Enhet--");
        //Denne skriver ut informasjon om enheten
        System.out.println(livingRoomLights);
        System.out.println("-------------");
        //Denne funksjonen slår på lyset
        System.out.println("Funksjonen slår på lyset ---> " + livingRoomLights.turnDeviceOn());
        System.out.println("Funksjonen slår av lyset ---> " + livingRoomLights.turnDeviceOff());

        System.out.println();
        System.out.println("--Gas Detection-Enhet--");
        System.out.println(gasDetecterUnit);
        System.out.println("-----------------------");
        //Denne funkjsonen(turnDeviceOn) slår på enheten
        System.out.println("Funksjonen slår på enheten ---> " + gasDetecterUnit.turnDeviceOn());
        //Denne funksjonen (turnDeviceOff) slår av enheten
        System.out.println("Funksjonen slår av enehten ---> " + gasDetecterUnit.turnDeviceOff());
        //Denne funksjonen(gasLeakDetectionSendAlert) sender en varsel melding
        System.out.println("Funksjonen sender en varsel melding ---> " + gasDetecterUnit.gasLeakDetetctedSendAlert());



    }
}
