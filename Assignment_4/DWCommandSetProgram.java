public class DWCommandSetProgram implements command {
 dishwasher dw;

 public DWCommandSetProgram(dishwasher dw) {
   this.dw = dw;
 }
 public void execute() {
   dw.set_program();
 }
}