public class CRCommandStopReturn implements command {
 cleaning_robot cr;

 public CRCommandStopReturn(cleaning_robot cr) {
   this.cr = cr;
 }
 public void execute() {
   cr.stop_return();
 }
}