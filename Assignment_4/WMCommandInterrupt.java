public class WMCommandInterrupt implements command {
 washing_machine wm;

 public WMCommandInterrupt(washing_machine wm) {
   this.wm = wm;
 }
 public void execute() {
   wm.interrupt();
 }
}