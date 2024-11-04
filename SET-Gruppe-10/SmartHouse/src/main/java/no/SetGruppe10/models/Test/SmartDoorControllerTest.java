package no.SetGruppe10.models.Test;

import no.SetGruppe10.models.SmartDoorController;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class SmartDoorControllerTest {
    public void SendsAlertCorrect(){
        SmartDoorController door = new SmartDoorController("Test1", true,
                true, "no motion");


    }

}