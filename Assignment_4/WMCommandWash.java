public class WMCommandWash implements command {
 washing_machine wm;

 public WMCommandWash(washing_machine wm) {
   this.wm = wm;
 }
 public void execute() {
   wm.wash();
 }
}