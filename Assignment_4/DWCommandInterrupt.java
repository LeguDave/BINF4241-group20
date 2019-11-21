public class DWCommandInterrupt implements command {
 dishwasher dw;

 public DWCommandInterrupt(dishwasher dw) {
   this.dw = dw;
 }
 public void execute() {
   dw.interrupt();
 }
}