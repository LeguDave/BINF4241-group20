public class MWCommandCheckTimer implements command {
 microwave mw;

 public MWCommandCheckTimer(microwave mw) {
   this.mw = mw;
 }
 public void execute() {
   mw.check_timer();
 }
}