public class DWCommandOff implements command {
 dishwasher dw;

 public DWCommandOff(dishwasher dw) {
   this.dw = dw;
 }
 public void execute() {
   dw.switch_off();
 }
}