public class CRCommandCheckCharging implements command {
 cleaning_robot cr;

 public CRCommandCheckCharging(cleaning_robot cr) {
   this.cr = cr;
 }
 public void execute() {
   cr.check_charging();
 }
}