public class CRCommandCompleteCleaning implements command {
 cleaning_robot cr;

 public CRCommandCompleteCleaning(cleaning_robot cr) {
   this.cr = cr;
 }
 public void execute() {
   cr.switch_on();
 }
}