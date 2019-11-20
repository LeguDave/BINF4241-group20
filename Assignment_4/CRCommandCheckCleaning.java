public class CRCommandCheckCleaning implements command {
 cleaning_robot cr;

 public CRCommandCheckCleaning(cleaning_robot cr) {
   this.cr = cr;
 }
 public void execute() {
   cr.check_cleaning();
 }
}