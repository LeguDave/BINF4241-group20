public class WMCommandCheckTimer implements command {
 washing_machine wm;

 public WMCommandCheckTimer(washing_machine wm) {
   this.wm = wm;
 }
 public void execute() {
   wm.check_timer();
 }
}