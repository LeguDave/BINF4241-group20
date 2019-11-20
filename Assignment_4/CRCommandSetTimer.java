public class CRCommandSetTimer implements command {
 cleaning_robot cr;

 public CRCommandSetTimer(cleaning_robot cr) {
   this.cr = cr;
 }
 public void execute() {
   cr.set_timer();
 }
}