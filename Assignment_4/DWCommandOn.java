public class DWCommandOn implements command {
 dishwasher dw;

 public DWCommandOn(dishwasher dw) {
   this.dw = dw;
 }
 public void execute() {
   dw.switch_on();
 }
}