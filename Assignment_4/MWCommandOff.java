public class MWCommandOff implements command {
 microwave mw;

 public MWCommandOff(microwave mw) {
   this.mw = mw;
 }
 public void execute() {
   mw.switch_off();
 }
}