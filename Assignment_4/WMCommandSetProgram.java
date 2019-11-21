public class WMCommandSetProgram implements command {
 washing_machine wm;

 public WMCommandSetProgram(washing_machine wm) {
   this.wm = wm;
 }
 public void execute() {
   wm.set_program();
 }
}