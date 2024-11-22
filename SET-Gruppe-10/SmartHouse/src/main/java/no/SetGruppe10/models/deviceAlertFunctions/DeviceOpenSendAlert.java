package no.SetGruppe10.models.deviceAlertFunctions;

//Denne klassen sender Alarm  en enhet er Åpent.
//Eksempel:
/*/@Override
   public String DeviceOpenSendAlert(){
   if(isWindowOpen == true){
    return "The Window is Open";
   }
   else {
        return "The Window Was Already Open"
   }
   }
 */
public interface DeviceOpenSendAlert {
    String deviceIsOpenAlert();
}
