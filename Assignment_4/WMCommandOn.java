public class WMCommandOn implements command {
 washing_machine wm;

 public WMCommandOn(washing_machine wm) {
   this.wm = wm;
 }
 public void execute() {
   wm.switch_on();
 }
}