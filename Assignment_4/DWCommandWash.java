public class DWCommandWash implements command {
 dishwasher dw;

 public DWCommandWash(dishwasher dw) {
   this.dw = dw;
 }
 public void execute() {
   dw.wash();
 }
}