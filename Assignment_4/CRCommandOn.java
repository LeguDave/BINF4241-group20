public class CRCommandOn implements command {
 cleaning_robot cr;

 public CRCommandSetTimer(cleaning robot cr) {
   this.cr = cr;
 }
 public void execute() {
   cr.switch_on();
 }
}