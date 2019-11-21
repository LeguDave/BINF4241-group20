public class DWCommandCheckTimer implements command {
 dishwasher dw;

 public DWCommandCheckTimer(dishwasher dw) {
   this.dw = dw;
 }
 public void execute() {
   dw.check_timer();
 }
}