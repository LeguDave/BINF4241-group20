public class WMCommandSetTemperature implements command {
 washing_machine wm;

 public WMCommandSetTemperature(washing_machine wm) {
   this.wm = wm;
 }
 public void execute() {
   wm.set_temperature();
 }
}