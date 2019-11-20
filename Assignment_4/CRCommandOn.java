public class CRCommandOn implements command {
 cleaning_robot cr;

 public CRCommandOn(cleaning_robot cr) {
   this.cr = cr;
 }
 public void execute() {
   cr.switch_on();
 }
}