public class CRCommandCheckBattery implements command {
 cleaning_robot cr;

 public CRCommandCheckBattery(cleaning_robot cr) {
   this.cr = cr;
 }
 public void execute() {
   cr.check_battery();
 }
}