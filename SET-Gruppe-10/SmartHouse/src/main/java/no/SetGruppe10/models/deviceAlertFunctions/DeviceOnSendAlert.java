package no.SetGruppe10.models.deviceAlertFunctions;

/*/Denne Interfacen/Funksjonen er ment for å sende Alarm til de sensetive objektene/
enhetene hvis de er "On" når brukeren ikke er hjemme.Hva som skal
sendes i form av alarm meldigen  er avhengig av klassen/enheten
 */
//Eksempel:
/*/@Override
   public String DeviceOnSendAlert(){
   if(isTheHeaterOn == true){
    return "The Heater is On";
   }
   else {
        return "The Heater Was Already On"
   }
   }
 */

public interface DeviceOnSendAlert {
    String safetyAlert();
}
