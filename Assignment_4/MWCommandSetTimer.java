public class MWCommandSetTimer implements command {
 microwave mw;

 public MWCommandSetTimer(microwave mw) {
   this.mw = mw;
 }
 public void execute() {
   mw.set_timer();
 }
}