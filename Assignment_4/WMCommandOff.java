public class WMCommandOff implements command {
 washing_machine wm;

 public WMCommandOff(washing_machine wm) {
   this.wm = wm;
 }
 public void execute() {
   wm.switch_off();
 }
}